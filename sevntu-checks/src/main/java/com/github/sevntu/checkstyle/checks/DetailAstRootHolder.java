////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code for adherence to a set of rules.
// Copyright (C) 2001-2017 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
////////////////////////////////////////////////////////////////////////////////

package com.github.sevntu.checkstyle.checks;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;

/**
 * Holds the link to the root of AST.
 * Inspired by FileContentsHolder.
 * @author Mike McMahon
 * @author Rick Giles
 * @author attatrol
 * @see com.puppycrawl.tools.checkstyle.checks.FileContentsHolder
 */
public class DetailAstRootHolder extends AbstractCheck {
    /** Thread local reference on the root of the current AST. */
    private static DetailAST root;

    /**
     * @return reference on the root of the current AST.
     */
    public static DetailAST getRoot() {
        return root;
    }

    @Override
    public int[] getDefaultTokens() {
        return new int[0];
    }

    @Override
    public int[] getRequiredTokens() {
        return new int[0];
    }

    @Override
    public int[] getAcceptableTokens() {
        return new int[0];
    }

    @Override
    /**
     * Creates new reference on the root of AST.
     */
    public void beginTree(DetailAST rootAST) {
        root = rootAST;
    }
}
