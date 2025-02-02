<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sspare | "나눠주고싶은 한 잔"</title>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/summernote@0.9.0/dist/summernote-lite.min.css">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.9.0/dist/summernote-lite.min.js"></script>
</head>
<body>
<div class="container">
    <div>
        <h3>음료 추가하기</h3>
    </div>
    <div>
        <form method="post">
            <div>
                <label>
                    음료이름
                    <input type="text" name="drinkName" placeholder="음료명을 입력하세요.">
                </label>
            </div>
            <div>
                <label>
                    카테고리번호
                    <input type="text" name="drCategoryId" placeholder="카테고리 번호를 작성하시오.">
                </label>
            </div>
            <div>
                <label>
                    가격
                    <input type="text" name="drinkPrice" placeholder="가격을 정해주세요.">
                </label>
            </div>
            <div>
                <label for="drinkInfo">음료 설명</label><textarea id="drinkInfo" name="drinkInfo"></textarea>
            </div>
            <div>
                <button>추가</button>
                <button type="button" onclick="location.href='list'">취소</button>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript">
    $(() => {
        $("#drinkInfo").summernote({
            lang: 'ko-KR',
            height: 300,
        });
    });
</script>
</body>
</html>
