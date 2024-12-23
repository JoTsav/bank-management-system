package com.dev.bank.adminPanel.system;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Dashboard {

    @FXML
    private BorderPane dashboardview;

    @FXML
    private AnchorPane balance_pane;

    @FXML
    private Label balance;

    @FXML
    private Label lAcno;

    @FXML
    private Label lcnum;

    @FXML
    private Label lcname;

    @FXML
    private Label lctype;

    @FXML
    private Label lwithdraw;

    @FXML
    private Label ldeposit;

    @FXML
    private Label lab10;

    @FXML
    private Label lab11;

    @FXML
    private Label lab12;

    @FXML
    private Label lab13;

    @FXML
    private Label lab14;

    @FXML
    private Label lab15;

    @FXML
    private Label lacstatus;


    public void setDashboardViewData(){
        /*lAcno.setText("AC No : "+AccountData.getAcNo());
        balance.setText(AccountData.getAvailable_Balance());
        ldeposit.setText(AccountData.getDeposit()+"$");
        lwithdraw.setText(AccountData.getWithdraw()+"$");
        lab10.setText(AccountData.getAcNo());
        lab11.setText(AccountData.getTitle());
        lab12.setText(AccountData.getOpening_date());
        lab13.setText(AccountData.getCurrent_Balance());
        lab14.setText(AccountData.getAvailable_Balance());
        lab15.setText(AccountData.getLast_Trans());
        lacstatus.setText(AccountData.getACstatus());
        lcname.setText(CardData.getCardname());
        lcnum.setText(CardData.getCardNumber());
        lctype.setText(CardData.getCardtype());*/
        AdminData admindata=new AdminData();
        String ab=String.format("%.2f",admindata.getAvailableBalance());
        String cb=String.format("%.2f",admindata.getCurrentBalance());
        balance.setText(ab);
        lab10.setText(admindata.getNumofAC()+"");
        lab13.setText(cb+" $");
        lab14.setText(ab+" $");
        String d =admindata.getDeposit()+" $";
        String w =admindata.getWithdraw()+" $";
        ldeposit.setText(d);
        lwithdraw.setText(w);
    }

}