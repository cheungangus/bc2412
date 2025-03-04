create database LearningSQL;
use LearningSQL;

1.	DQL (Data Query Language):	用於查詢數據庫中的數據。
1.1	SELECT: 用於從數據庫中查詢數據。可以選擇特定的列或所有列。
1.2	FROM: 用於指定要查詢的數據表，並可以與 JOIN 操作結合以檢索來自多個表的數據。inner join (常見), left join (常見), right join, full outer join , cross join 
1.3	WHERE: 用於設置查詢條件，過濾出符合條件的數據。
1.4	GROUP BY: 將查詢結果按指定列分組，通常與聚合函數（如 COUNT(), SUM(),AVG(),Min(),MAX()）一起使用。
1.5	HAVING: 用於過濾分組後的結果，通常用於配合 GROUP BY 使用。
1.6	ORDER BY: 用於對查詢結果進行排序，可以指定升序 (ASC) 或降序 (DESC)。
1.7	LIMIT: 限制查詢結果的數量，常用於只需要部分結果的場景。/ OFFSET 子句用於指定查詢結果中要跳過的行數，通常與 LIMIT 子句一起使用，以實現分頁功能。這使得用戶可以控制從哪一行開始檢索數據。
	Subquery
2.	DML (Data Manipulation Language):	用於操作數據庫中的數據，包括新增、更新和刪除數據。
2.1	INSERT: 用於向數據表中插入新數據。
2.2	UPDATE: 用於修改數據表中已存在的數據。
e.g:UPDATE users
	SET city = 'San Francisco'
	WHERE username = 'Alice'; -- (將更新用戶 Alice 的城市為「舊金山」)
2.3	DELETE: 用於刪除數據表中的數據。
e.g:DELETE FROM users
	WHERE username = 'Bob'; -- (這將刪除用戶 Bob 的記錄。)

3.	DCL (Data Control Language):	用於控制對數據庫對象的訪問權限。
3.1	GRANT: 用於授予用戶或角色對數據庫對象的權限。
3.2	REVOKE: 用於撤回之前授予的權限。

4.	TCL (Transaction Control Language):	用於管理數據庫中的事務，確保數據的一致性和完整性。
4.1	START (BEGIN) TRANSACTION: 開始一個新的事務，所有隨後的操作都將在該事務中進行。
4.2	COMMIT: 提交事務，將事務中的所有更改保存到數據庫中。
4.3	ROLLBACK: 回滾事務，撤消自事務開始以來所做的所有更改。

5.	DDL (Data Definition Language) :	用於定義和管理數據庫結構，包括創建和修改數據庫對象。
5.1	Target
	5.1.1	Database: 數據庫是一個組織化的數據集合，通常用於存儲和管理數據。
	5.1.2	Table: 表是數據庫中的基本單位，以行和列的形式組織數據。每個表都有一個名稱和一組列。
	5.1.3	Constraints: 約束是用於限制表中數據的規則，確保數據的完整性和有效性。例如，主鍵、外鍵、唯一約束等。
	5.1.4	View: 視圖是一個虛擬表，基於查詢的結果集。它並不實際存儲數據，而是顯示基於其他表的數據。
	5.1.5	Index: 索引是一種數據結構，旨在提高查詢速度。它可以加速對表中數據的檢索，類似於書籍的索引。
    
5.2	Operation
	5.2.1	CREATE: 創建新的數據庫對象，如數據庫、表、視圖等。
	5.2.2	DELETE (DROP): 刪除數據庫對象，如表或視圖。
	5.2.3	UPDATE: 更新已存在的數據庫對象的結構，例如修改表的結構。
	5.2.4	RENAME: 重命名數據庫對象，如表或列的名稱。
    
6	Operators
	6.1	Logical Operators邏輯運算符: 用於組合或反轉布爾表達式的操作符。
		6.1.1	AND: 當兩個條件都為真時，結果為真。
		6.1.2	OR: 當至少一個條件為真時，結果為真。
		6.1.3	NOT: 反轉條件的結果。
				e.g
                SELECT *
				FROM users
				WHERE (age > 18 AND city = 'New York') OR NOT city = 'Chicago';
				(這個查詢將返回年齡大於 18 且在「紐約」的用戶，或者所有不在「芝加哥」的用戶。)
6.2	UPDATE: 更新數據庫中現有記錄的操作。
6.3	RENAME: 用於重命名數據庫對象的操作。

7	Functions
	7.1	Numeric Functions
		用於數字計算的函數，例如：
		SUM(): 計算數字的總和。
		AVG(): 計算數字的平均值。
        
	7.2	String Functions
		用於字符串操作的函數，例如：
		CONCAT(): 連接兩個或多個字符串。e.g concat("first_name", " ", "last_name") -> alex wong
		SUBSTRING(): 提取字符串的一部分。
        
	7.3	Datetime Functions
		用於日期和時間操作的函數，例如：
		NOW(): 返回當前的日期和時間。
		DATEDIFF(): 計算兩個日期之間的差異。
        
	7.4	Null Functions
		處理空值的函數，例如：
		ISNULL(): 檢查值是否為空。
		COALESCE(): 返回第一個非空的值。
        
8.Data Types :	定義數據的類型。
8.1	Numeric: 數字類型，可包括整數、小數等。	int, float, decimal(10,2)-- 10位數字，其中2位小數
8.2	String: 字符串類型，用於存儲文本數據。	varchar(50) 最多50個字符, char(10) 固定10個字符,	text儲存長文章
8.3	Datetime: 日期和時間類型，用於存儲時間相關的數據。  datetime, date, time
8.4	Boolean: 布爾類型，只有真（TRUE）或假（FALSE）兩個值。 boolean 
8.5	JSON: 用於存儲結構化數據的類型，通常格式為 JSON（JavaScript Object Notation）。     
e.g	INSERT INTO settings (config) VALUES ('{"theme": "dark", "notifications": true}');