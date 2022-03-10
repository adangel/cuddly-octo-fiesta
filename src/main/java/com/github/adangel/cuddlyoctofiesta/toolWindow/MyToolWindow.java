package com.github.adangel.cuddlyoctofiesta.toolWindow;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.time.ZonedDateTime;

public class MyToolWindow {
    private JLabel time;
    private JButton refreshButton;
    private JPanel myToolWindowContent;

    public MyToolWindow(ToolWindow toolWindow) {
        refreshButton.addActionListener(e -> updateCurrentDateTime());

        updateCurrentDateTime();
    }

    private void updateCurrentDateTime() {
        time.setText(ZonedDateTime.now().toString());
    }

    public JPanel getContent() {
        return myToolWindowContent;
    }
}
