/**
 * Created by Yuu on 12/02/16.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "loginBean")
@SessionScoped
public class LoginBean {
    private String customerFName, customerLName, customerEmail, customerPassword;
    public String getCustomerFName()
    {
        return customerFName;
    }

    public void setCustomerFName(String customerFName){
        this.customerFName = customerFName;
    }
}
