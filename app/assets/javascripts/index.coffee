$ ->
  $.get "/objects", (data) ->
    $.each data, (index, item) ->
      $("#objects").append "<li>name: " + item.name + "</li>"
