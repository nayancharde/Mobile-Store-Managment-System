/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIPackage;

import Classes.PhoneDetails;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ViewPhonesManager extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ViewPhonesManager.class.getName());
    private JTable phonesTable;
    private DefaultTableModel model;

    /**
     * Creates new form ViewPhonesManager
     */
    public ViewPhonesManager() {
        initComponents();
        initUi();
        loadPhones();
    }

    private void initUi() {
        setTitle("Manage Phones");
        getContentPane().setLayout(new BorderLayout());

        model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Phone ID", "Brand", "Name", "OS", "Display", "Camera", "Processor", "RAM", "Storage", "Battery", "Price", "Category"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        phonesTable = new JTable(model);
        JScrollPane scroll = new JScrollPane(phonesTable);
        getContentPane().add(scroll, BorderLayout.CENTER);

        javax.swing.JPanel buttons = new javax.swing.JPanel();
        javax.swing.JButton btnUpdate = new javax.swing.JButton("Update");
        javax.swing.JButton btnDelete = new javax.swing.JButton("Delete");
        javax.swing.JButton btnBack = new javax.swing.JButton("Back");

        btnUpdate.addActionListener(evt -> onUpdate());
        btnDelete.addActionListener(evt -> onDelete());
        btnBack.addActionListener(evt -> onBack());

        buttons.add(btnUpdate);
        buttons.add(btnDelete);
        buttons.add(btnBack);
        getContentPane().add(buttons, BorderLayout.SOUTH);

        setSize(900, 450);
        setLocationRelativeTo(null);
    }

    private void loadPhones() {
        model.setRowCount(0);
        List<PhoneDetails> phones = PhoneDetails.listAllPhones();
        for (PhoneDetails p : phones) {
            model.addRow(new Object[]{
                    p.getPhoneId(),
                    p.getBrandName(),
                    p.getName(),
                    p.getOS(),
                    p.getDisplay(),
                    p.getCamera(),
                    p.getProcessor(),
                    p.getRAM(),
                    p.getStorage(),
                    p.getBattery(),
                    p.getPrice(),
                    p.getCategory()
            });
        }
    }

    private void onDelete() {
        int row = phonesTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Please select a phone first.", "Delete", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String phoneId = String.valueOf(model.getValueAt(row, 0));
        int confirm = JOptionPane.showConfirmDialog(this, "Delete phone " + phoneId + "?", "Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }
        if (PhoneDetails.deletePhoneById(phoneId)) {
            loadPhones();
            JOptionPane.showMessageDialog(this, "Deleted successfully.", "Delete", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Delete failed.", "Delete", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void onUpdate() {
        int row = phonesTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Please select a phone first.", "Update", JOptionPane.WARNING_MESSAGE);
            return;
        }

        PhoneDetails p = new PhoneDetails();
        p.setPhoneId(String.valueOf(model.getValueAt(row, 0)));

        String brand = prompt("Brand", String.valueOf(model.getValueAt(row, 1)));
        if (brand == null) return;
        String name = prompt("Name", String.valueOf(model.getValueAt(row, 2)));
        if (name == null) return;
        String os = prompt("OS", String.valueOf(model.getValueAt(row, 3)));
        if (os == null) return;
        String display = prompt("Display", String.valueOf(model.getValueAt(row, 4)));
        if (display == null) return;
        String camera = prompt("Camera", String.valueOf(model.getValueAt(row, 5)));
        if (camera == null) return;
        String processor = prompt("Processor", String.valueOf(model.getValueAt(row, 6)));
        if (processor == null) return;
        String ram = prompt("RAM", String.valueOf(model.getValueAt(row, 7)));
        if (ram == null) return;
        String storage = prompt("Storage", String.valueOf(model.getValueAt(row, 8)));
        if (storage == null) return;
        String battery = prompt("Battery", String.valueOf(model.getValueAt(row, 9)));
        if (battery == null) return;
        String price = prompt("Price", String.valueOf(model.getValueAt(row, 10)));
        if (price == null) return;
        String category = prompt("Category", String.valueOf(model.getValueAt(row, 11)));
        if (category == null) return;

        p.setBrandName(brand);
        p.setName(name);
        p.setOS(os);
        p.setDisplay(display);
        p.setCamera(camera);
        p.setProcessor(processor);
        p.setRAM(ram);
        p.setStorage(storage);
        p.setBattery(battery);
        p.setPrice(price);
        p.setCategory(category);

        if (PhoneDetails.updatePhone(p)) {
            loadPhones();
            JOptionPane.showMessageDialog(this, "Updated successfully.", "Update", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Update failed.", "Update", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String prompt(String label, String current) {
        String v = JOptionPane.showInputDialog(this, "Enter " + label + ":", current);
        if (v == null) return null;
        v = v.trim();
        if (v.isEmpty()) {
            JOptionPane.showMessageDialog(this, label + " cannot be blank.", "Update", JOptionPane.WARNING_MESSAGE);
            return null;
        }
        return v;
    }

    private void onBack() {
        this.hide();
        ManagerIF m = new ManagerIF();
        m.setVisible(true);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ViewPhonesManager().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
