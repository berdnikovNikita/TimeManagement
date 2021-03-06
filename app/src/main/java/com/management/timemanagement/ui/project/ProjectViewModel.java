package com.management.timemanagement.ui.project;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProjectViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ProjectViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Projects");
    }

    public LiveData<String> getText() { return mText; }
}
