module pl.adrian_komuda {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;

    opens pl.adrian_komuda;
    opens pl.adrian_komuda.view;
    opens pl.adrian_komuda.controller;
}