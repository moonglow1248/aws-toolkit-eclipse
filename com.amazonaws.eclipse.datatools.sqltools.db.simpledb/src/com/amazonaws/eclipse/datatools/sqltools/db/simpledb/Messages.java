/*
 * Copyright 2008-2011 Amazon Technologies, Inc. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
 * OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and 
 * limitations under the License. 
 */
package com.amazonaws.eclipse.datatools.sqltools.db.simpledb;

import org.eclipse.osgi.util.NLS;

public class Messages {
  private static final String BUNDLE_NAME = "com.amazonaws.eclipse.datatools.sqltools.db.simpledb.messages"; //$NON-NLS-1$

  public static String SimpleDB;

  public static String AmazonSimpleDB;

  private Messages() {
  }

  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }
}
