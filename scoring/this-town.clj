(def scores {:red 12, :blue 3, :yellow 1})

(defn sort-map [scores] (reverse (sort-by val scores)))

(defn score [scores]
    (let [ordered (sort-map scores)]
        (zipmap (keys ordered) (rest (vals ordered)))
    )
)

(score scores)