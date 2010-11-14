;;   Copyright (c) Zachary Tellman. All rights reserved.
;;   The use and distribution terms for this software are covered by the
;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;   which can be found in the file epl-v10.html at the root of this distribution.
;;   By using this software in any fashion, you are agreeing to be bound by
;;   the terms of this license.
;;   You must not remove this notice, or any other, from this software.

(ns gloss.core
  (:use [gloss bytes string primitives]))

(defn take-sig [sig callback]
  )

(defn string
  [charset & {:as options}]
  (let [charset (name charset)]
    (with-meta
      (cond
	(:length options) #(wrap-finite-strings % (:length options) charset)
	(:delimiters options)   )
      {:buf-seq-wrapper true})))