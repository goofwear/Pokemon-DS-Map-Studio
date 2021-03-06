/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor.backsound;

import editor.exceptions.WrongFormatException;
import editor.handler.MapEditorHandler;
import editor.sound.SoundPlayer;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import utils.LambdaUtils.VoidInterface;
import utils.Utils;

/**
 *
 * @author Trifindo
 */
public class BacksoundEditorDialog extends javax.swing.JDialog {

    private MapEditorHandler handler;
    private BacksoundHandler backsoundHandler;

    private SoundPlayer soundPlayer = new SoundPlayer();

    private boolean plateListEnabled = true;
    private boolean jcbSoundTypeEnabled = true;
    private boolean jsVolumeEnabled = true;

    private static final String[] soundFilenames = new String[]{
        "/sounds/backsounds/sound00.wav",
        "/sounds/backsounds/sound01.wav",
        "/sounds/backsounds/sound02.wav",
        "/sounds/backsounds/sound03.wav",
        "/sounds/backsounds/sound04.wav",
        "/sounds/backsounds/sound05.wav",
        "/sounds/backsounds/sound06.wav",
        "/sounds/backsounds/sound07.wav",
        "/sounds/backsounds/sound08.wav",
        "/sounds/backsounds/sound09.wav",
        "/sounds/backsounds/sound0A.wav",
        "/sounds/backsounds/sound0B.wav",
        "/sounds/backsounds/sound0C.wav",
        "/sounds/backsounds/sound0D.wav",
        "/sounds/backsounds/sound0E.wav",
        "/sounds/backsounds/sound0F.wav"};

    /**
     * Creates new form BacksoundEditorDialog
     */
    public BacksoundEditorDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backsoundDisplay = new BacksoundDisplay();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plateList = new javax.swing.JList<>();
        jbAddPlate = new javax.swing.JButton();
        jbRemovePlate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbSoundType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jsVolume = new javax.swing.JSlider();
        jbPlayPause = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbImport = new javax.swing.JButton();
        jbExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Backsound Editor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        backsoundDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(102, 102, 102)));

        javax.swing.GroupLayout backsoundDisplayLayout = new javax.swing.GroupLayout(backsoundDisplay);
        backsoundDisplay.setLayout(backsoundDisplayLayout);
        backsoundDisplayLayout.setHorizontalGroup(
            backsoundDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        backsoundDisplayLayout.setVerticalGroup(
            backsoundDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Soundplates"));

        plateList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        plateList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        plateList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                plateListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(plateList);

        jbAddPlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddIcon.png"))); // NOI18N
        jbAddPlate.setText("Add Plate");
        jbAddPlate.setPreferredSize(new java.awt.Dimension(119, 25));
        jbAddPlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddPlateActionPerformed(evt);
            }
        });

        jbRemovePlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/RemoveIcon.png"))); // NOI18N
        jbRemovePlate.setText("Remove Plate");
        jbRemovePlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemovePlateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAddPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbRemovePlate)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAddPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRemovePlate))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Soundplate Properties"));

        jLabel1.setText("Sound type:");

        jcbSoundType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Water flow", "Wind turbine", "Sea waves", "Silence 1", "Whirlpool", "Strong water current", "Silence 2", "Stadium chant", "Ship horn", "Silence 3", "Sea wave 2", "Bells ", "Wind", "Silence 4", "Unknown", "Synth horn" }));
        jcbSoundType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSoundTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Volume:");

        jsVolume.setMajorTickSpacing(1);
        jsVolume.setMaximum(2);
        jsVolume.setPaintLabels(true);
        jsVolume.setPaintTicks(true);
        jsVolume.setSnapToTicks(true);
        jsVolume.setValue(1);
        jsVolume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsVolumeStateChanged(evt);
            }
        });

        jbPlayPause.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbPlayPause.setForeground(new Color(0, 153, 0));
        jbPlayPause.setText("Play Sound");
        jbPlayPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlayPauseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPlayPause, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbSoundType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jsVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbSoundType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPlayPause)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Import / Export Backsound File"));

        jbImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ImportTileIcon.png"))); // NOI18N
        jbImport.setText("Import");
        jbImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImportActionPerformed(evt);
            }
        });

        jbExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ExportIcon.png"))); // NOI18N
        jbExport.setText("Export");
        jbExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbImport, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExport, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbImport)
                    .addComponent(jbExport))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backsoundDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backsoundDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plateListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_plateListValueChanged
        if (plateListEnabled) {
            backsoundHandler.setIndexSelected(plateList.getSelectedIndex());
            updateView();
            backsoundDisplay.repaint();
        }
    }//GEN-LAST:event_plateListValueChanged

    private void jbAddPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddPlateActionPerformed
        backsoundHandler.addSoundplate();
        backsoundHandler.setIndexSelected(backsoundHandler.getSoundplates().size() - 1);

        updateView();
        repaint();
    }//GEN-LAST:event_jbAddPlateActionPerformed

    private void jbRemovePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemovePlateActionPerformed
        if (backsoundHandler.getSoundplates().size() > 0) {
            backsoundHandler.removeSelectedSoundplate();
            updateView();
            repaint();
        }
    }//GEN-LAST:event_jbRemovePlateActionPerformed

    private void jbExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportActionPerformed
        saveBacksoundWithDialog();
    }//GEN-LAST:event_jbExportActionPerformed

    private void jbImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImportActionPerformed
        openBacksoundWithDialog();
    }//GEN-LAST:event_jbImportActionPerformed

    private void jcbSoundTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSoundTypeActionPerformed
        if (backsoundHandler.getSoundplates().size() > 0) {
            backsoundHandler.getSelectedSoundplate().setSoundCode(jcbSoundType.getSelectedIndex());
            updateViewSoundType();
            backsoundDisplay.repaint();
        }
    }//GEN-LAST:event_jcbSoundTypeActionPerformed

    private void jsVolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsVolumeStateChanged
        if (backsoundHandler.getSoundplates().size() > 0) {
            backsoundHandler.getSelectedSoundplate().setVolume(jsVolume.getValue());
            updateViewVolume();
            backsoundDisplay.repaint();
        }
    }//GEN-LAST:event_jsVolumeStateChanged

    private void jbPlayPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlayPauseActionPerformed
        if (backsoundHandler.getSoundplates().size() > 0) {
            if (soundPlayer.isAlive()) {
                soundPlayer.stopPlayer();
            } else {
                soundPlayer = new SoundPlayer();
                soundPlayer.init(soundFilenames[backsoundHandler.getSelectedSoundplate().getSoundCode()],
                        () -> {
                            jbPlayPause.setText("Play Sound");
                            jbPlayPause.setForeground(new Color(0, 153, 0));
                        });
                soundPlayer.start();
                jbPlayPause.setText("Stop");
                jbPlayPause.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_jbPlayPauseActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (soundPlayer.isAlive()) {
            soundPlayer.stopPlayer();
        }

    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BacksoundDisplay backsoundDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAddPlate;
    private javax.swing.JButton jbExport;
    private javax.swing.JButton jbImport;
    private javax.swing.JButton jbPlayPause;
    private javax.swing.JButton jbRemovePlate;
    private javax.swing.JComboBox<String> jcbSoundType;
    private javax.swing.JSlider jsVolume;
    private javax.swing.JList<String> plateList;
    // End of variables declaration//GEN-END:variables

    public void init(MapEditorHandler handler, BufferedImage mapImage) {
        this.handler = handler;
        this.backsoundHandler = new BacksoundHandler(handler, this);
        this.backsoundDisplay.init(handler, backsoundHandler, mapImage);

        backsoundHandler.setIndexSelected(0);
        updateView();
    }

    public void updateView() {
        updateViewPlateNames();

        updateViewSoundType();
        updateViewVolume();

        if(backsoundHandler.getSoundplates().size() > 0){
            jsVolume.setEnabled(true);
            jcbSoundType.setEnabled(true);
            jbPlayPause.setEnabled(true);
        }else{
            jsVolume.setEnabled(false);
            jcbSoundType.setEnabled(false);
            jbPlayPause.setEnabled(false);
        }
    }

    private void updateViewSoundType() {
        if (backsoundHandler.getSoundplates().size() > 0) {
            jcbSoundTypeEnabled = false;
            int index = Math.max(0, Math.min(backsoundHandler.getSelectedSoundplate().soundCode, 15));
            jcbSoundType.setSelectedIndex(index);
            jcbSoundTypeEnabled = true;
        }
    }

    private void updateViewVolume() {
        if (backsoundHandler.getSoundplates().size() > 0) {
            jsVolumeEnabled = false;
            int volume = Math.max(0, Math.min(backsoundHandler.getSelectedSoundplate().volume, 2));
            jsVolume.setValue(volume);
            jsVolumeEnabled = true;
        }
    }

    private void updateViewPlateNames() {

        plateListEnabled = false;
        DefaultListModel demoList = new DefaultListModel();
        for (int i = 0; i < backsoundHandler.getSoundplates().size(); i++) {
            String name = "Soundplate " + i;
            demoList.addElement(name);
        }
        plateList.setModel(demoList);
        plateList.setSelectedIndex(backsoundHandler.getIndexSelected());
        plateListEnabled = true;

    }

    public void openBacksoundWithDialog() {
        final JFileChooser fc = new JFileChooser();
        if (handler.getLastBdhcDirectoryUsed() != null) {
            fc.setCurrentDirectory(new File(handler.getLastBdhcDirectoryUsed()));
        }
        fc.setFileFilter(new FileNameExtensionFilter("Backsound File (*.bgs)", Backsound.fileExtension));
        fc.setApproveButtonText("Open");
        fc.setDialogTitle("Open Background Sound File");
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                String path = fc.getSelectedFile().getPath();
                handler.setLastBdhcDirectoryUsed(fc.getSelectedFile().getParent());

                handler.setBacksound(new Backsound(path));

                backsoundHandler.setIndexSelected(0);
                updateView();
                backsoundDisplay.repaint();

            } catch (IOException | WrongFormatException ex) {
                JOptionPane.showMessageDialog(this, "Can't open file", "Error opening Backsound file", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void saveBacksoundWithDialog() {
        final JFileChooser fc = new JFileChooser();
        if (handler.getLastBdhcDirectoryUsed() != null) {
            fc.setCurrentDirectory(new File(handler.getLastBdhcDirectoryUsed()));
        }
        fc.setFileFilter(new FileNameExtensionFilter("Backsound File (*.bgs)", Backsound.fileExtension));
        fc.setApproveButtonText("Save");
        fc.setDialogTitle("Save Background Sound File");
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                String path = fc.getSelectedFile().getPath();
                handler.setLastBdhcDirectoryUsed(fc.getSelectedFile().getParent());
                path = Utils.addExtensionToPath(path, Backsound.fileExtension);

                backsoundHandler.getBacksound().writeToFile(path);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Can't save file", "Error saving Backsound file", JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
