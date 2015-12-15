package com.mik.gwt.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;

import java.util.Date;


/**
 * Created by mikitjuk on 14.12.15.
 */
public class MainForm extends Composite {
    interface MainFormUiBinder extends UiBinder<Widget, MainForm> {}
    private static MainFormUiBinder ourUiBinder = GWT.create(MainFormUiBinder.class);

//    @UiField
//    ListBox listBox;

    @UiField
    Image logo;
    @UiField
    Label footer;
    @UiField
    TextBox user;
//    @UiField
//    TextBox password;
//    @UiField
//    Button login;


    public MainForm(String... names) {
        initWidget(ourUiBinder.createAndBindUi(this));
       // logo.setAltText("ardas_logo.png");
        logo.setUrl("image/ardas_logo.png");
        logo.setHeight("150px");

        user.setValue("fff");
        user.setText("fffrr");

        footer.setText("@ " + DateTimeFormat.getFormat("yyyy").format(new Date()) + " Ardas Group");

        //Resource(new ImageResourcePrototype("ardas_logo.png"));
//        for (String name : names) {
//            listBox.addItem(name);
//        }
    }

//    public ListBox getListBox() {
//        return listBox;
//    }
}