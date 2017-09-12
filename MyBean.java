/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import javax.ejb.Stateful;
import javax.ejb.LocalBean;

/**
 *
 * @author iis
 */

@Stateful
@LocalBean
public class MyBean implements MyInterface{

    @Override
    public void addElement(int e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeElement(int e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
