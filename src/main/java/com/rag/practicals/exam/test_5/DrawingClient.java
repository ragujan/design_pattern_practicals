package com.rag.practicals.exam.test_5;

import com.rag.practicals.exam.test_5.shape_decorator.DashedBorderDecorator;
import com.rag.practicals.exam.test_5.shape_decorator.Shape;
import com.rag.practicals.exam.test_5.shape_decorator.ShapeType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DrawingClient extends JFrame {
    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;

    //    private static final Color colors[] = {Color.RED, Color.GREEN, Color.YELLOW};
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
                    ColorType cType = getRandomColorType();
                    System.out.println("color type is "+cType.name());
                    Shape shape = ShapeFactory.getShape(getRandomShape(), cType);
                    shape.draw(g, getRandomX(), getRandomY(), 100, 100);
                }
            }
        });

    }

    public static void main(String[] args) {
        DrawingClient drawing = new DrawingClient(500, 600);
    }

    public static void main2(String[] args) {
        int count = 3; // Change this value to the desired count

        int randomNumber = pickRandomNumber(count);
        for (int i = 0; i <20 ; i++) {
            System.out.println(pickRandomNumber(count));
        }
//        System.out.println("Randomly picked number: " + randomNumber);

    }

    private static int pickRandomNumber(int count) {
        Random random = new Random();
        return random.nextInt(count );
    }

    private ShapeType getRandomShape() {
        List<ShapeType> shapeTypeList = Arrays.asList(ShapeType.values());
        return shapeTypeList.get((int) (Math.random() * shapeTypeLength));
    }

    private ColorType getRandomColorType() {
        List<ColorType> colorTypeList = Arrays.asList(ColorType.values());
        int random = pickRandomNumber(colorTypeList.size());
        return colorTypeList.get(random);
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
