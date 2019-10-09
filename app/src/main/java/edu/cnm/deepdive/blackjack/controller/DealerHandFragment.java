package edu.cnm.deepdive.blackjack.controller;

import androidx.lifecycle.LiveData;
import edu.cnm.deepdive.blackjack.R;
import edu.cnm.deepdive.blackjack.model.pojo.HandWithCards;
import edu.cnm.deepdive.blackjack.viewmodel.MainViewModel;

public class DealerHandFragment extends HandFragment {

  @Override
  public LiveData<HandWithCards> handToObserve(MainViewModel viewModel) {
    return viewModel.getDealerHand();
  }

  @Override
  public int getLayout() {
    return R.layout.fragment_hand;
  }

}
