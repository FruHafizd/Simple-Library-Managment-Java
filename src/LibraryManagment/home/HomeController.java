/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagment.home;

import LibraryManagment.Book.BookView;
import LibraryManagment.Borrowers.BorrowersView;
import LibraryManagment.Category.CategoryView;
import LibraryManagment.Transaction.TransactionView;
import Login.LoginForm;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author User
 */
public class HomeController {
    
    public void setFullScreen(HomeView hv) {
        try {
            hv.setExtendedState(MAXIMIZED_BOTH);
        } catch (Exception error) {
            System.out.println("Error at HomeController-setFullScreen, details : " + error.toString());
            JOptionPane.showMessageDialog(hv, "Error at HomeController-setFullScreen, details : " + error.toString());
        }
    }
    
    
    public void exitMenuItemAction(HomeView hv) {
    try {
        int konfirmasi = JOptionPane.showConfirmDialog(hv, "Are you sure you want to logout?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION) {
            // Menutup form HomeView
            hv.dispose();
            
            // Membuka form Login kembali
            LoginForm loginForm = new LoginForm(); // Ganti dengan nama class form login Anda
            loginForm.setVisible(true);
        }
    } catch (Exception error) {
        System.out.println("Error at HomeController-exitMenuItemAction, details: " + error.toString());
        JOptionPane.showMessageDialog(hv, "Error at HomeController-exitMenuItemAction, details: " + error.toString());
        }
    }

    
    public void menuItemBook(HomeView hv) {
        try {
            HomeView.menuItemBook.setEnabled(false);
            BookView gv = new BookView();
            hv.panelHome.add(gv);
            gv.setVisible(true);
            gv.addInternalFrameListener(new InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(InternalFrameEvent e) {
                    HomeView.menuItemBook.setEnabled(true);
                }
            });
        } catch (Exception error) {
            System.out.println("Error at HomeController-menuItemBook, details : " + error.toString());
            JOptionPane.showMessageDialog(hv, "Error at HomeController-menuItemBook, details : " + error.toString());
        }
    }
    
    
    public void menuItemBorrowers(HomeView hv) {
        try {
            HomeView.menuItemBorrowers.setEnabled(false);
            BorrowersView gv = new BorrowersView();
            hv.panelHome.add(gv);
            gv.setVisible(true);
            gv.addInternalFrameListener(new InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(InternalFrameEvent e) {
                    HomeView.menuItemBorrowers.setEnabled(true);
                }
            });
        } catch (Exception error) {
            System.out.println("Error at HomeController-menuItemBorrowers, details : " + error.toString());
            JOptionPane.showMessageDialog(hv, "Error at HomeController-menuItemBorrowers, details : " + error.toString());
        }
    }
    
    public void menuItemCategory(HomeView hv) {
        try {
            HomeView.menuItemCategory.setEnabled(false);
            CategoryView gv = new CategoryView();
            hv.panelHome.add(gv);
            gv.setVisible(true);
            gv.addInternalFrameListener(new InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(InternalFrameEvent e) {
                    HomeView.menuItemCategory.setEnabled(true);
                }
            });
        } catch (Exception error) {
            System.out.println("Error at HomeController-menuItemCategory, details : " + error.toString());
            JOptionPane.showMessageDialog(hv, "Error at HomeController-menuItemCategory, details : " + error.toString());
        }
    }
    
    
    public void menuTransaction(HomeView hv) {
        try {
            HomeView.menuItemCategory.setEnabled(false);
            TransactionView gv = new TransactionView();
            hv.panelHome.add(gv);
            gv.setVisible(true);
            gv.addInternalFrameListener(new InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(InternalFrameEvent e) {
                    HomeView.menuItemCategory.setEnabled(true);
                }
            });
        } catch (Exception error) {
            System.out.println("Error at HomeController-menuTransaction, details : " + error.toString());
            JOptionPane.showMessageDialog(hv, "Error at HomeController-menuTransaction, details : " + error.toString());
        }
    }
    
}
