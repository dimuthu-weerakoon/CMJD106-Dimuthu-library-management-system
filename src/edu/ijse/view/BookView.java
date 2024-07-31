/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.view;

import edu.ijse.Controller.BookController;
import edu.ijse.Controller.CategoryController;
import edu.ijse.dto.BookDto;
import edu.ijse.dto.CategoryDto;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dimuthu
 */
public class BookView extends javax.swing.JFrame {

    private BookController bookController;
    private CategoryController categoryController;
    private HashMap<String, String> categoryMap;

    /**
     * Creates new form BookView
     */
    public BookView() {
        initComponents();
        bookController = new BookController();
        categoryController = new CategoryController();
        categoryMap = new HashMap<>();
        showCategories();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblBookId = new javax.swing.JLabel();
        lblBookTitle = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtCategoryId = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        selectCategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Library Management System");

        lblBookId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBookId.setText("Book ID");

        lblBookTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBookTitle.setText("Title");

        lblAuthor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAuthor.setText("Author");

        lblCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCategory.setText("Category ID");

        txtBookId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtCategoryId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryIdActionPerformed(evt);
            }
        });

        txtAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBooksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBooks);

        selectCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBookId)
                            .addComponent(lblBookTitle))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtBookId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategory)
                                    .addComponent(lblAuthor))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCategoryId)
                                    .addComponent(txtAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookId)
                    .addComponent(lblCategory)
                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookTitle)
                    .addComponent(lblAuthor)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(selectCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCategoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryIdActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updateBook();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here: 
        saveBook();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        deleteBook();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBooksMouseClicked
        // TODO add your handling code here:
        searchBook();
    }//GEN-LAST:event_tblBooksMouseClicked

    private void selectCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCategoryActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_selectCategoryActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBookId;
    private javax.swing.JLabel lblBookTitle;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JComboBox<String> selectCategory;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtCategoryId;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

    private void showCategories() {
        try {

            ArrayList<CategoryDto> categoryDtos = categoryController.getAll();
            selectCategory.removeAllItems();
            selectCategory.addItem("Select Category");
            for (CategoryDto categoryDto : categoryDtos) {

                selectCategory.addItem(categoryDto.getCategoryName());
                categoryMap.put(categoryDto.getCategoryName(), categoryDto.getCategoryId());
            }
        } catch (Exception e) {
        }
    }

    private void saveBook() {
        try {
            String selectedCategory = (String) selectCategory.getSelectedItem();
            String categoryId = categoryMap.get(selectedCategory);
            BookDto bookDto = new BookDto(txtBookId.getText(), txtTitle.getText(), txtAuthor.getText(), categoryId);
            String response;
            response = bookController.save(bookDto);
            JOptionPane.showMessageDialog(this, response);
            clearForm();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at save Book");
            e.printStackTrace();
            clearForm();
        }
    }

    private void updateBook() {
        try {
            String selectedCategory = (String) selectCategory.getSelectedItem();
            String categoryId = categoryMap.get(selectedCategory);
            BookDto bookDto = new BookDto(txtBookId.getText(), txtTitle.getText(), txtAuthor.getText(), categoryId);
            String response;
            response = bookController.update(bookDto);
            JOptionPane.showMessageDialog(this, response);
            clearForm();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
            e.getMessage();
            clearForm();
        }
    }

    private void deleteBook() {
        try {
            String bookId = txtBookId.getText();
            String response = bookController.delete(bookId);
            clearForm();
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at Delete Book");
            e.printStackTrace();
        }

    }

    private void searchBook() {
        try {
            String bookId = tblBooks.getValueAt(tblBooks.getSelectedRow(), 0).toString();
            BookDto bookDto = bookController.get(bookId);
            if (bookDto != null) {
                txtBookId.setText(bookDto.getBookId());
                txtTitle.setText(bookDto.getTitle());
                txtAuthor.setText(bookDto.getAuthor());
                txtCategoryId.setText(bookDto.getCategoryId());

            } else {
                JOptionPane.showMessageDialog(this, "Book not Found.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at Loading data");
        }
    }

    private void loadTable() {
        try {
            String[] columns = {"Book ID", "Title", "Author", "Category"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tblBooks.setModel(dtm);
            ArrayList<BookDto> bookDtos = bookController.getAll();
            for (BookDto bookDto : bookDtos) {
                Object[] rawData = {bookDto.getBookId(), bookDto.getTitle(), bookDto.getAuthor(), bookDto.getCategoryId()};
                dtm.addRow(rawData);
            }
        } catch (Exception e) {

        }
    }

    private void clearForm() {
        txtBookId.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        txtCategoryId.setText("");
        selectCategory.setSelectedItem("Select Category");
    }

}
