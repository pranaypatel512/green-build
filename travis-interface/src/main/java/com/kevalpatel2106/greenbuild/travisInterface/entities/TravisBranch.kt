/*
 * Copyright 2018 Keval Patel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kevalpatel2106.greenbuild.travisInterface.entities

import com.google.gson.annotations.SerializedName
import com.kevalpatel2106.ci.greenbuild.base.ciInterface.entities.Branch


internal data class TravisBranch(
        @field:SerializedName("name")
        val name: String,

        @field:SerializedName("default_branch")
        val isDefault: Boolean
) {

    fun toBranch(): Branch {
        return Branch(
                name = name,
                isDefault = isDefault
        )
    }
}
