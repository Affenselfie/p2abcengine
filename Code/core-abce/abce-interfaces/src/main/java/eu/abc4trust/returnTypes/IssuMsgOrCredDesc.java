//* Licensed Materials - Property of IBM, Miracle A/S, and            *
//* Alexandra Instituttet A/S                                         *
//* eu.abc4trust.pabce.1.0                                            *
//* (C) Copyright IBM Corp. 2012. All Rights Reserved.                *
//* (C) Copyright Miracle A/S, Denmark. 2012. All Rights Reserved.    *
//* (C) Copyright Alexandra Instituttet A/S, Denmark. 2012. All       *
//* Rights Reserved.                                                  *
//* US Government Users Restricted Rights - Use, duplication or       *
//* disclosure restricted by GSA ADP Schedule Contract with IBM Corp. *
//*/**/****************************************************************

package eu.abc4trust.returnTypes;

import eu.abc4trust.xml.CredentialDescription;
import eu.abc4trust.xml.IssuanceMessage;

public class IssuMsgOrCredDesc {

  public IssuanceMessage im;
  public CredentialDescription cd;
  
  public IssuMsgOrCredDesc() {
    this.im = null;
    this.cd = null;
  }
  
  public IssuMsgOrCredDesc(IssuanceMessage im) {
    this.im = im;
    this.cd = null;
  }
  
  public IssuMsgOrCredDesc(IssuanceReturn ir) {
    if(ir.uia != null) {
      throw new RuntimeException("Cannot convert IssuanceReturn->IssuMsgOrCredDesc containing UiIssuanceArguments");
    }
    this.im = ir.im;
    this.cd = ir.cd;
  }
}