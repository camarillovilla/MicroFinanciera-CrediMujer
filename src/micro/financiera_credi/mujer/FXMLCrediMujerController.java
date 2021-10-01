package micro.financiera_credi.mujer;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Antonio de Jesús Domínguez García
 */
public class FXMLCrediMujerController implements Initializable {
    
    @FXML
    private JFXButton buttonSimulateCredit;

    @FXML
    private ImageView imageEstablished;

    @FXML
    private ImageView imageDirectSale;

    @FXML
    private ImageView imageSemiFixed;

    @FXML
    private ImageView imageMovil;

    @FXML
    private ImageView imageFashionAndBeauty;

    @FXML
    private ImageView imageGrocery;

    @FXML
    private ImageView imageFood;

    @FXML
    private ImageView imageCleaningProducts;

    @FXML
    private JFXRadioButton radiotButtonFirst;

    @FXML
    private JFXRadioButton radioButtonSecond;

    @FXML
    private JFXRadioButton radioButtonThirth;

    @FXML
    private JFXRadioButton radioButtonFourth;

    @FXML
    private TextField textFieldAmount;

    @FXML
    private TextField textFieldTerm;

    @FXML
    private TextField textFieldMonthlyPayment;
    
    @FXML
    private Label labelBusiness;

    @FXML
    private Label labelProduct;

    @FXML
    private Label labelMonthlySales;
    
    @FXML
    private AnchorPane anchorPaneEstablish;

    @FXML
    private AnchorPane anchorPaneDirectSale;

    @FXML
    private AnchorPane anchorPaneSemiFixed;

    @FXML
    private AnchorPane anchorPaneMovil;

    @FXML
    private AnchorPane anchorPaneFashionAndBeauty;

    @FXML
    private AnchorPane anchorPaneGrocery;

    @FXML
    private AnchorPane anchorPaneFood;

    @FXML
    private AnchorPane anchorPaneCleaningProducts;
    
    private String businessType = null;
    private String productType = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {}
    
    @FXML
    public void selectImageEstablished(MouseEvent event) {
        businessType = "Established";
        unselectBusinessPanes();
        anchorPaneEstablish.setVisible(true);
    }
    
    @FXML
    public void selectImageDirectSale(MouseEvent event) {
        businessType = "DirectSale";
        unselectBusinessPanes();
        anchorPaneDirectSale.setVisible(true);
    }
    
    @FXML
    public void selectImageSemiFixed(MouseEvent event) {
        businessType = "SemiFixed";
        unselectBusinessPanes();
        anchorPaneSemiFixed.setVisible(true);
    }

    @FXML
    public void selectImageMovil(MouseEvent event) {
        businessType = "Movil";
        unselectBusinessPanes();
        anchorPaneMovil.setVisible(true);
    }
    
    @FXML
    public void selectImageCleaningProducts(MouseEvent event) {
        productType = "CleaningProducts";
        unselectProductsPanes();
        anchorPaneCleaningProducts.setVisible(true);
    }

    @FXML
    public void selectImageFashionAndBeauty(MouseEvent event) {
        productType = "FashionAndBeauty";
        unselectProductsPanes();
        anchorPaneFashionAndBeauty.setVisible(true);
    }

    @FXML
    public void selectImageFood(MouseEvent event) {
        productType = "Food";
        unselectProductsPanes();
        anchorPaneFood.setVisible(true);
    }

    @FXML
    public void selectImageGrocery(MouseEvent event) {
        productType = "Grocery";
        unselectProductsPanes();
        anchorPaneGrocery.setVisible(true);
    }
    
    public void unselectBusinessPanes() {
        anchorPaneEstablish.setVisible(false);
        anchorPaneDirectSale.setVisible(false);
        anchorPaneSemiFixed.setVisible(false);
        anchorPaneMovil.setVisible(false);
    }
    
    public void unselectProductsPanes() {
        anchorPaneCleaningProducts.setVisible(false);
        anchorPaneFashionAndBeauty.setVisible(false);
        anchorPaneFood.setVisible(false);
        anchorPaneGrocery.setVisible(false);
    }
    
    public void cleanRadioButtonsOnAction() {
        radiotButtonFirst.setSelected(false);
        radioButtonSecond.setSelected(false);
        radioButtonThirth.setSelected(false);
        radioButtonFourth.setSelected(false);
    }
    
    @FXML
    public void selectFirstRadioButton(ActionEvent event) {
        cleanRadioButtonsOnAction();
        radiotButtonFirst.setSelected(true);
    }

    @FXML
    public void selectSecondRadioButton(ActionEvent event) {
        cleanRadioButtonsOnAction();
        radioButtonSecond.setSelected(true);
    }

    @FXML
    public void selectThirthRadioButton(ActionEvent event) {
        cleanRadioButtonsOnAction();
        radioButtonThirth.setSelected(true);
    }
    
    @FXML
    public void selectFourthRadioButton(ActionEvent event) {
        cleanRadioButtonsOnAction();
        radioButtonFourth.setSelected(true);
    }
    
    public int calculateLoanAmount() {
        int amount = 0;
        switch (businessType) {
            case "Established":
                amount = getAmountByEstablished();
                break;
            case "DirectSale":
                amount = getAmountByDirectSale();
                break;
            case "SemiFixed":
                amount = getAmountBySemiFixed();
                break;
            case "Movil":
                amount = getAmountByMovil();
                break;
            default:
                break;
        }
        return amount;
    }
    
    public int getAmountByEstablished() {
        int amount = 0;
        switch (productType) {
            case "FashionAndBeauty":
                amount = 100000;
                break;
            case "Grocery":
                amount = 100000;
                break;
            case "Food":
                amount = 50000;
                break;
            case "CleaningProducts":
                amount = 100000;
                break;
            default:
                break;
        }
        return amount;
    }
    
    public int getAmountByDirectSale() {
        int amount = 0;
        switch (productType) {
            case "FashionAndBeauty":
                amount = 50000;
                break;
            case "Grocery":
                amount = 100000;
                break;
            case "Food":
                amount = 50000;
                break;
            case "CleaningProducts":
                amount = 100000;
                break;
            default:
                break;
        }
        return amount;
    }
    
    public int getAmountBySemiFixed() {
        int amount = 0;
        switch (productType) {
            case "FashionAndBeauty":
                amount = 25000;
                break;
            case "Grocery":
                amount = 75000;
                break;
            case "Food":
                amount = 50000;
                break;
            case "CleaningProducts":
                amount = 75000;
                break;
            default:
                break;
        }
        return amount;
    }
    
    public int getAmountByMovil() {
        int amount = 0;
        switch (productType) {
            case "FashionAndBeauty":
                amount = 25000;
                break;
            case "Grocery":
                amount = 75000;
                break;
            case "Food":
                amount = 50000;
                break;
            case "CleaningProducts":
                amount = 75000;
                break;
            default:
                break;
        }
        return amount;
    }
    
    public int getTermYears() {
        int term = 0;
        if (radiotButtonFirst.isSelected()) {
            term = 3;
        } else if (radioButtonSecond.isSelected()) {
            term = 2;
        } else if (radioButtonThirth.isSelected()) {
            term = 2;
        } else if (radioButtonFourth.isSelected()) {
            term = 1;
        } else {
            term = 0;
        }
        return term;
    }
    
    public double getInterestRate() {
        double interest = 0.0;
        if (radiotButtonFirst.isSelected()) {
            interest = 0.12;
        } else if (radioButtonSecond.isSelected()) {
            interest = 0.12;
        } else if (radioButtonThirth.isSelected()) {
            interest = 0.14;
        } else if (radioButtonFourth.isSelected()) {
            interest = 0.12;
        }
        return interest;
    }
    
    public double calculateFixedInterest() {
        double fixedInterest = 0;
        int loanAmount = calculateLoanAmount();
        double interestRate = getInterestRate();
        int termYears = getTermYears();
        fixedInterest = (loanAmount * interestRate) * termYears;
        return fixedInterest;
    }
    
    public double calculateMonthlyAmount() {
        double monthlyAmount = 0;
        int loanAmount = calculateLoanAmount();
        double fixedInterest = calculateFixedInterest();
        int termYears = getTermYears();
        int termMonths = termYears * 12;
        monthlyAmount = (loanAmount + fixedInterest) / termMonths;
        return monthlyAmount;
    }
    public boolean validateBusiness() {
        boolean isValid = false;
        if (businessType != null) {
            isValid = validateProduct(true);
        } else {
            isValid = false;
            validateProduct(isValid);
            labelBusiness.setVisible(true);
            textFieldAmount.setText("******");
        }
        return isValid;
    }
    
    public boolean validateProduct(boolean validBusiness) {
        boolean isValid = false;
        if (productType != null && validBusiness) {
            isValid = true;
            int amount = calculateLoanAmount();
            textFieldAmount.setText("$" + new DecimalFormat("##,###.##").format(amount));
        } else if(productType != null && !validBusiness) {
            isValid = false;
            textFieldAmount.setText("******");
        }else {
            isValid = false;
            labelProduct.setVisible(true);
            textFieldAmount.setText("******");
        }
        return isValid;
    }
    
    public boolean validateTerm() {
        boolean isValid = false;
        int term = getTermYears();
        if (term != 0) {
            isValid = true;
            textFieldTerm.setText(term + " años");
        } else {
            isValid = false;
            labelMonthlySales.setVisible(true);
            textFieldTerm.setText("******");
        }
        return isValid;
    }
    
    @FXML
    public void simulateCredit(ActionEvent event) {
        boolean validBusiness = false;
        boolean validTerm = false;
        validBusiness = validateBusiness();
        validTerm = validateTerm();
        if (validBusiness&&validTerm) {
            double monthlyAmount = calculateMonthlyAmount();
            textFieldMonthlyPayment.setText("$" + new DecimalFormat("##,###.##").format(monthlyAmount));
        } else {
            textFieldMonthlyPayment.setText("******");
        }
    }     
    
}
