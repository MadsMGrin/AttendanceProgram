package gui.controller;

import BE.Student;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.util.Callback;
import javafx.util.StringConverter;

import java.net.URL;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    @FXML
    private Label nameLabel;
    @FXML
    private Label classesLabel;
    @FXML
    private Label schoolMailLabel;

    @FXML
    private DatePicker datePicker;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        Callback<DatePicker, DateCell> dayCellFactory = dp -> new DateCell()
        {
            @Override
            public void updateItem(LocalDate item, boolean empty)
            {
                super.updateItem(item, empty);

                if(item.isBefore(LocalDate.of(2022,01,01)) || item.isAfter(LocalDate.now()))
                {
                    setStyle("-fx-background-color: #ffc0cb; -fx-text-fill: darkgray;");
                        setDisable(true);
                }
                else if(item.isEqual(LocalDate.of(2022,02,22))){
                    setStyle("-fx-background-color: green; -fx-text-fill: #C1EEF2;");
                }
            }
        };

        datePicker.setDayCellFactory(dayCellFactory);
        datePicker.setPromptText("dd/mm/yyyy");
        datePicker.setValue(LocalDate.now());
    }

    public void setFields(Student selectedStudent) {

    }

}
