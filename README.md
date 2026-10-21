## AP10 

### Screenshot Aplikasi
1. Screenshot 2026-10-22 012634.png
2. Screenshot 2026-10-22 012410.png
---

### Aliran Data (Main → CharacterManager → MainWindow) & MVC
Alur kerja program mengikuti konsep dasar **Model-View-Controller (MVC)**:
1. **`Main`** bertindak sebagai inisiator yang membuat instance **`CharacterManager`** (Model) dan mengisinya dengan data awal karakter.
2. **`CharacterManager`** mengelola dan menyimpan seluruh data karakter serta kalkulasi bisnisnya (seperti perhitungan `getAverageLevel()`).
3. **`Main`** kemudian mempassing objek `CharacterManager` tersebut ke konstruktor **`MainWindow`** (View).
4. **`MainWindow`** mengambil data dinamis melalui method `getAllCharacters()` dan `getAverageLevel()` untuk merender elemen komponen GUI (`JLabel`) secara dinamis di layar user.

---

### Daftar Karakter Baru
* **joko** (Tipe: `HEALER`, Level: 8)  
  *Alasan*: Diperlukan karakter tipe pendukung (Healer) berlevel tinggi untuk melengkapi formasi tim serta menguji statistik *average level*.
* **bowo** (Tipe: `WARRIOR`, Level: 10)  
  *Alasan*: Ditambahkan sebagai petarung garis depan (*frontliner*) berlevel paling tinggi untuk menguji kalkulasi *average level* agar bernilai lebih tinggi.

---

### Laporan Analisis Lengkap
Link Google Docs Analisis GUI & MVC : https://docs.google.com/document/d/1XonWHd4YzvKCWsVufNltKQTQ8frGako4CmX2f0v2QcA/edit?usp=sharing 