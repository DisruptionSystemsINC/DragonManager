package com.disruption.dragonmanager.components;

import com.disruption.dragonmanager.components.Window.DisruptionWindow;
import com.disruption.dragonmanager.components.Window.DisruptionWindowBuilder;
import com.disruptionsystems.DragonLog;

public class DisruptionWindowManager {

    private DisruptionWindow[] windows;
    private DragonLog logger;

    public DisruptionWindow[] getWindows() {
        return windows;
    }
    public DisruptionWindowManager addWindow(DisruptionWindow window) {
        if (windows == null) {
            windows = new DisruptionWindow[1];
        }

        if (window != null) {
            windows = new DisruptionWindow[windows.length + 1];
            windows[windows.length - 1] = window;
            return this;
        }
    }

    public DisruptionWindowManager setDragonLog(DragonLog logger){
        this.logger = logger;
        return this;
    }
}
