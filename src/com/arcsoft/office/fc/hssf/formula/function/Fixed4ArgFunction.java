/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package com.arcsoft.office.fc.hssf.formula.function;

import com.arcsoft.office.fc.hssf.formula.eval.ErrorEval;
import com.arcsoft.office.fc.hssf.formula.eval.ValueEval;

/**
 * Convenience base class for functions that must take exactly four arguments.
 *
 * @author Josh Micich
 */
public abstract class Fixed4ArgFunction implements Function4Arg {
	public final ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) {
		if (args.length != 4) {
			return ErrorEval.VALUE_INVALID;
		}
		return evaluate(srcRowIndex, srcColumnIndex, args[0], args[1], args[2], args[3]);
	}
}
