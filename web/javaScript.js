$(function () {
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
            url: "/auth",
            method: "DELETE",
            success: function() {
                document.cookie = "JSESSIONID=; expires=Thu, 01 Jan 1970 00:00:01 GMT;";
                window.location = "/";
            }
        });
    })

});

//
//
//
//
//
// li.append(div);
//
// $("#writings").append(li);
//
// li.onclick = function () {
//     if(this.class == "hidden") {
//         this.class = "shown";
//         var p = document.createElement("p");
//         p.innerHTML = "content";
//         var input = document.createElement("input");
//         input.type = "text";
//         input.onclick = function () {}; //hogy lehessen beleírni kekeeke
//         var result = document.createElement("p");
//         result.innerHTML = "enyi";
//         this.children[0].appendChild(p);
//         this.children[0].appendChild(input);
//         this.children[0].appendChild(result);
//     }else if(this.class == "shown"){
//         //this.children = null;
//         while (this.children[0].firstChild) {
//             this.children[0].removeChild(this.children[0].firstChild);
//         }
//         this.class = "hidden";
//     }
//
// }


//     if(this.class == "hidden"){
//         this.class = "shown";
//         var me = this;
//         $.get(this.id, function (a) {
//             me.children[0].innerHTML = a;
//         });
//         var input = document.createElement("input");
//         var result = document.createElement("p");
//         this.children[0].innerHTML += input.outerHTML;
//         this.children[0]. innerHTML += result.outerHTML;
//         input.onchange = function () {
//
//             var result = 0;
//             console.log(this);
//             for(var j = 0; j < this.parentElement.innerHTML.length - this.value.length+1; j++){
//                 for(var k = 0; k < this.value; k++){
//                     if(!(this.value[k] == this.parentElement.innerHTML[j+k])){
//                         continue;
//                     }
//                     if(k >= this.value.length-1){
//                         result++;
//                     }
//                 }
//             }
//             this.siblings[0].innerHTML = result;
//         }
//
//     }else if(this.class == "shown"){
//         this.class = "hidden";
//         this.children[0].innerHTML = "";
//     }
// }


// for(var i = 0; i < artList.length; i++){
//     var li = document.createElement("li");
//     var art = artList[i];
//     li.innerText = art.title + "   published: " + art.publishDate;
//     //li.class = "hidden";
//     li.id = art.path;
//
//
//     li.onclick = function () {
//         console.log(li)
//     };
//
//     $("#writings").append(li);
// }