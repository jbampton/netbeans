/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 */
package org.netbeans.modules.php.twig.editor.parsing;

import org.netbeans.modules.php.twig.editor.TwigTestBase;

public class TwigParserErrorTest extends TwigTestBase {

    public TwigParserErrorTest(String testName) {
        super(testName);
    }

    // Unopend
    // #271040
    public void testUnopendSetError_01() throws Exception {
        checkErrors("testfiles/parsing/unopend/unopend_set_error_01.twig");
    }

    public void testUnopendSetError_02() throws Exception {
        checkErrors("testfiles/parsing/unopend/unopend_set_error_02.twig");
    }

    public void testUnopendSetError_03() throws Exception {
        checkErrors("testfiles/parsing/unopend/unopend_set_error_03.twig");
    }

    public void testUnopendSetError_04() throws Exception {
        checkErrors("testfiles/parsing/unopend/unopend_set_error_04.twig");
    }

    public void testUnopendSetError_05() throws Exception {
        checkErrors("testfiles/parsing/unopend/unopend_set_error_05.twig");
    }

    public void testUnopendSetNoError_01() throws Exception {
        checkErrors("testfiles/parsing/unopend/unopend_set_noerror_01.twig");
    }

    public void testUnopendSetNoError_02() throws Exception {
        checkErrors("testfiles/parsing/unopend/unopend_set_noerror_02.twig");
    }

    public void testUnopendSetNoError_03() throws Exception {
        checkErrors("testfiles/parsing/unopend/unopend_set_noerror_03.twig");
    }

    public void testUnopendSetNoError_04() throws Exception {
        checkErrors("testfiles/parsing/unopend/unopend_set_noerror_04.twig");
    }

    // Unclosed
    public void testUnclosedSetError_01() throws Exception {
        checkErrors("testfiles/parsing/unclosed/unclosed_set_error_01.twig");
    }

    public void testUnclosedSetError_02() throws Exception {
        checkErrors("testfiles/parsing/unclosed/unclosed_set_error_02.twig");
    }

    public void testUnclosedSetError_03() throws Exception {
        checkErrors("testfiles/parsing/unclosed/unclosed_set_error_03.twig");
    }

    public void testUnclosedSetError_04() throws Exception {
        checkErrors("testfiles/parsing/unclosed/unclosed_set_error_04.twig");
    }

    public void testUnclosedSetNoError_01() throws Exception {
        checkErrors("testfiles/parsing/unclosed/unclosed_set_noerror_01.twig");
    }

    public void testUnclosedSetNoError_02() throws Exception {
        checkErrors("testfiles/parsing/unclosed/unclosed_set_noerror_02.twig");
    }

    public void testUnclosedSetNoError_03() throws Exception {
        checkErrors("testfiles/parsing/unclosed/unclosed_set_noerror_03.twig");
    }

    public void testUnclosedSetNoError_04() throws Exception {
        checkErrors("testfiles/parsing/unclosed/unclosed_set_noerror_04.twig");
    }

}