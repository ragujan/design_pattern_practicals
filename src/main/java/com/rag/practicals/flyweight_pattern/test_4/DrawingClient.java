package com.rag.practicals.flyweight_pattern.test_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class DrawingClient extends JFrame {
    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;

    private static final Color colors[] = {Color.RED, Color.GREEN, Color.YELLOW};
    private static int shapeTypeLength = ShapeType.values().length;


    public DrawingClient(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        Container contentPane = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = panel.getGraphics();

                for (int i = 0; i < 20; i++) {
                    Shape shape = ShapeFactory.getShape(getRandomShape(),getRandomColorType());
                    shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight());
                }
            }
        });

    }

    public static void main(String[] args) {
        DrawingClient drawing = new DrawingClient(500, 600);
    }

    private ShapeType getRandomShape() {
        List<ShapeType> shapeTypeList = Arrays.asList(ShapeType.values());
        return shapeTypeList.get((int) (Math.random() * shapeTypeLength));
    }

    private ColorType getRandomColorType() {
        List<ColorType> colorTypeList = Arrays.asList(ColorType.values());
        return colorTypeList.get((int) (Math.random() * colorTypeList.size()));
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }


}
