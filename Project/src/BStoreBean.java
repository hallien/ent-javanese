import javax.faces.bean.ManagedBean;

/**
 * Created by Yuu on 11/30/16.
 */
@ManagedBean
public class BStoreBean {


    private String customerFName, customerLName, customerEmail, customerPassword;
    public String getCustomerFName()
    {
        return customerFName;
    }

    public void setCustomerFName(String customerFName){
        this.customerFName = customerFName;
    }

}
