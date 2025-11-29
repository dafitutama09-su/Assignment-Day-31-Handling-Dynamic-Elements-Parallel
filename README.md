# 🧪 Assignment Day 31 – Handling Dynamic Elements & Parallel Execution  
Automation Testing – Dibimbing.id

Project ini merupakan automation testing untuk website **SauceDemo** menggunakan **Selenium + TestNG** dengan penerapan **Page Object Model (POM)** serta eksekusi **parallel**.

---

## 🚀 Test Scenario: Success Checkout

Tujuan: Melakukan proses checkout produk di https://www.saucedemo.com hingga selesai dan memverifikasi pesan berhasil.

### **Steps yang di-automate:**
1. Buka website https://www.saucedemo.com/
2. Login dengan:
   - Username: `standard_user`
   - Password: `secret_sauce`
3. Pilih produk **Sauce Labs Backpack**
4. Klik **Add to Cart**
5. Klik icon **keranjang** di kanan atas
6. Klik **Checkout**
7. Isi form **Your Information**
8. Klik **Continue**
9. Klik **Finish**
10. Verify bahwa teks **“Thank you for your order!”** muncul

---

## 🧱 Tools & Teknologi
- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- WebDriverManager
- TestNG Parallel Execution
