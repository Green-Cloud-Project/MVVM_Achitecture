package com.share.mvvm_architecture.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.share.mvvm_architecture.R;
import com.share.mvvm_architecture.data.model.RentalSpot;
import com.share.mvvm_architecture.databinding.ItemRentalSpotBinding;
import com.share.mvvm_architecture.viewmodel.ItemRentalSpotViewModel;

import java.util.ArrayList;
import java.util.List;

public class RentalSpotAdapter extends RecyclerView.Adapter<RentalSpotAdapter.RentalSpotVH> {
    private List<RentalSpot> data = new ArrayList<>();

    RentalSpotAdapter(List<RentalSpot> userData) {
        data = userData;
    }

    @NonNull
    @Override
    public RentalSpotVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRentalSpotBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_rental_spot,
                parent, false);

        return new RentalSpotVH(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RentalSpotVH holder, int position) {
        holder.bindItem(data.get(position));
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    class RentalSpotVH extends RecyclerView.ViewHolder {
        ItemRentalSpotBinding itemRentalSpotBinding;

        RentalSpotVH(@NonNull ItemRentalSpotBinding binding) {
            super(binding.itemRentalSpot);
            itemRentalSpotBinding = binding;
        }

        void bindItem(RentalSpot item) {
            if (itemRentalSpotBinding.getViewmodel() == null) {
                itemRentalSpotBinding.setViewmodel(new ItemRentalSpotViewModel(item));
            } else {
                itemRentalSpotBinding.getViewmodel().setRentalSpot(item);
            }
        }
    }
}
