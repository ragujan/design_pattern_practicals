package com.rag.practicals.test;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollablePanelExample {
    private JFrame frame;
    private JPanel mainPanel;
    private JScrollPane scrollPane;
    private int panelCount = 0;

    public ScrollablePanelExample() {
        frame = new JFrame("Scrollable JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JButton addButton = new JButton("Add Panel");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewPanel();
            }
        });

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.getContentPane().add(addButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void addNewPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 100));
        panel.setBackground(Color.lightGray);
        panel.setBorder(BorderFactory.createEtchedBorder());
        JLabel label = new JLabel("Panel " + (++panelCount));
        panel.add(label);

        mainPanel.add(panel);
        frame.revalidate();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ScrollablePanelExample();
            }
        });
    }
}
