[h2]Bugs, Issues, and things that go bump in the night...[/h2]

[h3]Something went wrong! Who is charge of fixing it?[/h3]

This software is open source and was built by and is maintained by unpaid volunteers. So the quick answer is that nobody is in charge of fixing things. However, some of us have worked long and hard to provide a quality experience for you and don't wish to see you in discomfort because of a software issue or bug. 

The first thing you need to do is talk to your hub administrator - the person who runs and manages your site. They are in the unique position of having access to the internal software and database and [b]logfiles[/b] and will need to be involved in fixing your problem. Other people "on the net" can't really help with this. The first thing [b]they[/b] need to do is look at their logs and/or try to reproduce the problem. So try to be as helpful and courteous as possible in helping them look into the problem. 

To find your site administrator (if you don't know who they are) please look at [url=[baseurl]/siteinfo]this page[/url]. If they have not provided any contact info on that page or provided an "Impressum" there, see [url=[baseurl]/siteinfo/json]this site info summary[/url] under the heading "admin:".

[h3]I'm a site administrator; what do I do?[/h3]

It's your site, fix it! OK, sometimes it isn't that easy. There could be other sites involved, and the problem may not even be on your site but elsewhere in the network. Try to pin down the communication endpoints (hubs or sites) involved in the problem and contact the administrator of that site or those sites. Please try and provide an event time of when things went wrong so it can be found in the logs. Work with the other administrator(s) to find the cause of the problem. Logfiles are your friend. When something happens in the software that we didn't expect, it is nearly always logged. 

[h3]The white screen of death[/h3]

If you get a blank white screen when doing something, this is almost always a code or syntax error. There are instructions in your .htconfig.php file for enabling syntax logging. Do this and repeat the sequence which led to the error and it should log the offending line of code. Hopefully you will be able to fix the problem with this information. When you do, please submit the fix "upstream" so that we can share the fix with the rest of the project members. This is the key benefit of using open source software - we share with each other and everybody benefits.

[h3]I'm stumped. I can't figure out what is wrong.[/h3]

At this point it might be worthwhile discussing the issue on one of the online forums. There may be several of these and some may be more suited to your spoken language. As a last resort, try "Channel One", which is in English.

Other developers may need to find out more, so do your homework and document what is happening and everything you've tried. Don't say "I did xyz and it didn't work." That doesn't tell us anything. Tell us precisely what steps you took and what you expected the result to be, and precisely what happened as a result. If there were any error messages, don't say "there was an error message". Tell us exactly what the message said.

If the project developers can't help you right away, understand that they are volunteers and may have a lot of other work and demands on their time. At this point you need to file a bug report. You will need an account on github.com to do this. So register, and then visit https://github.com/redmatrix/hubzilla/issues
. Create an issue here and provide all the same information that you provided online. Don't leave out anything. 

Then you wait. If it's a high profile issue, it may get fixed quickly. But nobody is in charge of fixing bugs. If it lingers without resolution, please spend some more time investigating the problem. Ask about anything you don't understand related to the behaviour. You will learn more about how the software works and quite possibly figure out why it isn't working now. Ultimately it is somebody in the community who is going to fix this and you are a member of the community; and this is how the open source process works.

And just a word of warning. If you file 10 or 20 or 40 bugs on your first day looking at the project and without exploring how the software was supposed to work in the first place, you will probably be ignored. This is a public project and we are unfortunately frequented by "whingers" who like to waste our time complaining about stuff.  Don't be one of them. The more helpful and courteous you are, the more helpful and courteous we will be in return. This applies to everything you do in life and is only mentioned here as a reminder.      
       