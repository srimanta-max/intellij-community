// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.codeWithMe

import org.jetbrains.annotations.ApiStatus

open class ClientIdServiceImpl : ClientIdService {
  private val storage = ThreadLocal<String>()

  override var clientIdValue: String?
    get() = storage.get()
    set(value) = storage.set(value)

  @ApiStatus.Internal
  override val checkLongActivity = false
}