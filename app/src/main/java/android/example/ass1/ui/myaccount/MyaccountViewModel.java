package android.example.ass1.ui.myaccount;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

class MyaccountViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyaccountViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is myaccount fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}