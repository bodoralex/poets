$(function () {
    console.log("kakis");
    $.get("./arts", writingsFiller);

    function writingsFiller(allTheWritings) {
        var artList = JSON.parse(allTheWritings);

        artList.forEach(function (item) {

            var li = document.createElement("li");
            var art = item;
            li.innerText = art.title + "   published: " + art.publishDate;
            li.id = art.path;
            console.log(li.id);
            li.onclick = function () {
                $.get(li.id, function (response) {
                    $("article").text(response);
                });
                $("#counter").text(" ");
            };
            $("ul").append(li);
        });
    }
    $("#search").change(function () {
        var count = 0;
        var needle = $("#search").val();
        var haystack = $("article").text();
        for(var i = 0; i+needle.length < haystack.length+1; i++){
            if(needle === haystack.substr(i, needle.length)){
                count++;
            }
        }
        $("#counter").text(count);
    });
    $("#logout").click(function () {
        document.cookie = "JSESSIONID=; expires=Thu, 01 Jan 1970 00:00:01 GMT;";
        $.ajax({
            url: "./auth",
            method: "DELETE",
            success: function() {
                document.cookie = "JSESSIONID=; expires=Thu, 01 Jan 1970 00:00:01 GMT;";
                window.location = "./";
            }
        });
    })

});