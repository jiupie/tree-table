-- 查询所有后代
SELECT
    c.*,t.*
FROM
    service_classification AS c
        INNER JOIN service_path_info t ON c.id = t.descendant
WHERE
        t.ancestor = 1


--查询所有祖先
SELECT
    c.*
FROM
    service_classification AS c
        INNER JOIN service_path_info t ON c.id = t.ancestor
WHERE
        t.descendant = 5