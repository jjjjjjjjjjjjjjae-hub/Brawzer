package com.bro.ghost;

import android.os.Bundle;
import android.util.Log;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Қолданба ашылғанда жаңартуды тексеру
        checkUpdates();
    }

    private void checkUpdates() {
        Log.d("OTA", "Жаңарту тексерілуде...");
        // Бұл жерге кейінірек жүктеу логикасын толықтырамыз
    }
}
