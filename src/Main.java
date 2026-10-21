import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.view.MainWindow;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {

        // 1. Siapkan DATA terlebih dahulu (layer Model)
        CharacterManager manager = new CharacterManager();
        manager.addCharacter(new Character("Alyka", CharacterType.WARRIOR, 5));
        manager.addCharacter(new Character("Ariana", CharacterType.MAGE, 3));
        manager.addCharacter(new Character("V", CharacterType.ARCHER, 4));
        
        // Karakter tambahan sesuai syarat Bagian B (total 5)
        manager.addCharacter(new Character("joko", CharacterType.HEALER, 8));
        manager.addCharacter(new Character("bowo", CharacterType.WARRIOR, 10));

        // 2. Jalankan GUI dengan AMAN di Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(manager);
            window.setVisible(true); // WAJIB
        });
    }
}