package com.share.mvvm_architecture.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.share.mvvm_architecture.data.model.RentalSpot;
import com.share.mvvm_architecture.data.remote.repository.RentalSpotRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private RentalSpotRepository repository = new RentalSpotRepository();
    public LiveData<List<RentalSpot>> allRentalSpots = repository.getRentalSpotData();

}
