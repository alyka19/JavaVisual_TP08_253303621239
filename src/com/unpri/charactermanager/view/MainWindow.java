package com.unpri.charactermanager.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

/**
 * Jendela utama aplikasi Character Manager.
 * Menerapkan prinsip MVC: View meminta data statistik langsung dari Model (CharacterManager).
 */
public class MainWindow extends JFrame {

    private JPanel mainPanel;
    private CharacterManager manager;   // Menyimpan referensi ke Model

    public MainWindow(CharacterManager manager) {
        super("Character Manager v0.3");    
        this.manager = manager;  

        initComponents();

        setSize(500, 480); // Sedikit diperbesar tingginya agar statistik muat
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        mainPanel = new JPanel();

        ArrayList<Character> characterList = manager.getAllCharacters();

        JLabel titleLabel = new JLabel("=== Daftar Karakter (" + characterList.size() + ") ===");
        mainPanel.add(titleLabel);

        // Loop setiap Character untuk membuat JLabel informasinya
        for (Character c : characterList) {
            String info = c.getName() + " | " + c.getType() +
                          " | Lv." + c.getLevel() +
                          " | HP:" + c.getHitPoints() +
                          " | ATK:" + c.getAttackPower() +
                          " | Mana:" + c.getMana();
            JLabel characterLabel = new JLabel(info);
            mainPanel.add(characterLabel);   
        }

        // ===== TAMBAHAN STATISTIK =====
        // Memanfaatkan method dari Model (CharacterManager), View tidak menghitung sendiri.
        double avgLevel = manager.getAverageLevel();
        JLabel statsLabel = new JLabel("📊 Rata-rata Level: " + String.format("%.2f", avgLevel));
        mainPanel.add(statsLabel);

        add(mainPanel);
    }
}