(ns bitset.core-test
  (:require [clojure.test :refer :all]
            [bitset.core :refer :all]))

(deftest test-bitset
  (testing "bitset"
    (testing "should be make-able"
      (is (not (nil? (bitset)))))))
