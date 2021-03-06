/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor.vertexcolors;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 *
 * @author Trifindo
 */
public class ColorBrightnessPanel extends javax.swing.JPanel {

    private static final int width = 13;
    private static final int height = 101;
    private static final int circleSize = 6;
    private static final int margin = 6;
    private BufferedImage colorGradientImg;

    private final int currentX = width / 2;
    private int currentY = 0;

    /**
     * Creates new form ColorBrightnessPanel
     */
    public ColorBrightnessPanel() {
        initComponents();

        this.setPreferredSize(new Dimension(width + 2 * margin, height + 2 * margin));

        colorGradientImg = generateColorGradient(width, height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        int y = evt.getY() - margin;

        if (y < 0) {
            currentY = 0;
        } else if (y > height) {
            y = height;
        } else {
            currentY = y;
        }
        repaint();

    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int y = evt.getY() - margin;

        if (y < 0) {
            currentY = 0;
        } else if (y > height) {
            y = height;
        } else {
            currentY = y;
        }
        repaint();
    }//GEN-LAST:event_formMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (colorGradientImg != null) {
            g.drawImage(colorGradientImg, margin, margin, null);
        }

        Graphics2D g2 = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);

        g.setColor(Color.white);
        g.fillOval(currentX - circleSize / 2 + margin, currentY - circleSize / 2 + margin, circleSize, circleSize);

        g.setColor(Color.black);
        g.drawOval(currentX - circleSize / 2 + margin, currentY - circleSize / 2 + margin, circleSize, circleSize);

    }

    private BufferedImage generateColorGradient(int width, int height) {
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                float value = 1.0f - (float) j / img.getHeight();
                Color c = new Color(value, value, value);
                img.setRGB(i, j, c.getRGB());
            }
        }

        BufferedImage imgComp = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);

        Graphics g = imgComp.getGraphics();

        g.fillRoundRect(0, 0, width - 1, height - 1, 8, 8);

        Graphics2D g2d = (Graphics2D) g;
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_IN);
        g2d.setComposite(ac);

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        g2d.drawImage(img, 0, 0, null);

        ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER);
        g2d.setComposite(ac);

        g.setColor(Color.black);
        g.drawRoundRect(0, 0, width - 1, height - 1, 8, 8);

        return imgComp;
    }
    
    
    public float getBrightness(){
        return 1.0f - (float)currentY / height;
    }
    
    public void setBrightness(float brightness){
        this.currentY = (int)((1.0f - brightness) * height); 
    }
    
    public void setColor(Color c){
        float[] hsb = Color.RGBtoHSB(c.getRed(), c.getGreen(), c.getBlue(), null);
        this.currentY = (int)((1.0f - hsb[2]) * height); 
    }
}
