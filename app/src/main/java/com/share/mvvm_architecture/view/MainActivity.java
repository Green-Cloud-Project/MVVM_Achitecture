package com.share.mvvm_architecture.view;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.share.mvvm_architecture.R;
import com.share.mvvm_architecture.data.model.RentalSpot;
import com.share.mvvm_architecture.databinding.ActivityMainBinding;
import com.share.mvvm_architecture.viewmodel.MainActivityViewModel;

import java.util.List;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel viewModel;
    private RentalSpotAdapter adapter;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupViewModel();
        setupView();
    }

    private void setupView() {
        activityMainBinding.recyclerview.setHasFixedSize(true);
        viewModel.allRentalSpots.observe(this, rentalSpots -> {
            Timber.d("대여소 데이터 로딩완료: %s", rentalSpots.size());
            new Handler().postDelayed(() -> {
                loadData(rentalSpots);
            }, 500);
        });
    }

    private void setupViewModel() {
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }


    private void loadData(List<RentalSpot> rentalSpots) {
        if (!rentalSpots.isEmpty()) {
            adapter = new RentalSpotAdapter(rentalSpots);
            activityMainBinding.recyclerview.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        } else {
            Toast.makeText(this, "데이터를 가져올 수 없습니다.", Toast.LENGTH_SHORT).show();
        }
    }
}
