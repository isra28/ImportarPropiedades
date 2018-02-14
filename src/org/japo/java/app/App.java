/* 
 * Copyright 2017 Israel Fernández Chiva - israel.1daw@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Properties;
import org.japo.java.libraries.UtilesApp;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class App {

    public void launchApp() {
        Properties prp = UtilesApp.importarPropiedades();
        
        System.out.println("PROPIEDADES DE USUARIO");
        System.out.println("======================");
        System.out.printf("Maquina ..: %s%n", prp.getProperty("host"));
        System.out.printf("Puerto ...: %s%n", prp.getProperty("port"));
        System.out.printf("Usuario ..: %s%n", prp.getProperty("user"));
        System.out.printf("Password .: %s%n", prp.getProperty("pass"));
        System.out.printf("IP .......: %s%n", prp.getProperty("ip"));
    }
}
