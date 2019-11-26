package com.share.mvvm_architecture.viewmodel;

import androidx.databinding.BaseObservable;

import com.share.mvvm_architecture.data.model.RentalSpot;

public class ItemRentalSpotViewModel extends BaseObservable {

    private RentalSpot rentalSpot;

    public ItemRentalSpotViewModel(RentalSpot data) {
        rentalSpot = data;
    }

    public void setRentalSpot(RentalSpot data) {
        rentalSpot = data;
        notifyChange();
    }

    public String getOffice_name() {
        return rentalSpot.getOffice_name();
    }

    public String getOffice_location() {
        return rentalSpot.getOffice_location();
    }

}
