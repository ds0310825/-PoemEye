package com.example.player_2.poem;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import java.util.Timer;
import java.util.TimerTask;

//叫出鍵盤用的
//不知道為什麼kotlin寫的會閃退

public class keyboard_cont {

    public void open(final EditText editText){  //因為在進入畫面時，頁面還沒準備好，但鍵盤已經準備好了，這會導致鍵盤沒出現，所以用延遲來解決
        Timer timer = new Timer();
             timer.schedule(new TimerTask()   {
            public void run() {
                InputMethodManager inputManager = (InputMethodManager)editText.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.showSoftInput(editText, 0);
            }
        }, 998);
    }
}
