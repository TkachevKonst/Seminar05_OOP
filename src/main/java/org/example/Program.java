package org.example;

import org.example.models.TableModel;
import org.example.presenters.BookingPresenter;
import org.example.views.BookingView;

import javax.xml.crypto.Data;
import java.util.Date;

public class Program {

    //TODO: Метод changeReservationTable должен заработать!
    public static void main(String[] args) {

        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.updateTablesUI();
        bookingView.reservationTable(new Date(), 3, "Станислав");
        bookingView.reservationTable(new Date(), 1, "Михаил");
        bookingView.reservationTable(new Date(), 4, "Григорий");
        bookingView.reservationTable(new Date(), 5, "Николай");




        bookingView.changeReservationTable(1004, new Date(), 2, "Николай");


    }

}
