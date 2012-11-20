  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>DatabaseProj/src/com/db/ncsu/Main.java at 323d99724fba4b7a8b474336d9a79e37b8558082 · jlschuma/DatabaseProj</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon-precomposed" sizes="57x57" href="apple-touch-icon-114.png" />
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="apple-touch-icon-114.png" />
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="apple-touch-icon-144.png" />
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="apple-touch-icon-144.png" />
    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="zNYEQdqh3l71CNZf0yl9uQJDsIPYZsOedp01U2lIR/s=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/assets/github-863c29cca566cf1453ac6d72e882633a1a3ab976.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="https://a248.e.akamai.net/assets.github.com/assets/github2-4a4b0e9b3dcc3f83159b4fd41dbd00d0a97de4e9.css" media="screen" rel="stylesheet" type="text/css" />
    


    <script src="https://a248.e.akamai.net/assets.github.com/assets/frameworks-57542e0cba19d068168099f287c117efa142863c.js" type="text/javascript"></script>
    <script src="https://a248.e.akamai.net/assets.github.com/assets/github-32859c368778680a8938f939d7e41c9feaa5ed95.js" type="text/javascript"></script>
    

      <link rel='permalink' href='/jlschuma/DatabaseProj/blob/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/ncsu/Main.java'>
    <meta property="og:title" content="DatabaseProj"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/jlschuma/DatabaseProj"/>
    <meta property="og:image" content="https://a248.e.akamai.net/assets.github.com/images/gravatars/gravatar-user-420.png?1345673561"/>
    <meta property="og:site_name" content="GitHub"/>
    <meta property="og:description" content="Contribute to DatabaseProj development by creating an account on GitHub."/>

    <meta name="description" content="Contribute to DatabaseProj development by creating an account on GitHub." />

  <link href="https://github.com/jlschuma/DatabaseProj/commits/323d99724fba4b7a8b474336d9a79e37b8558082.atom" rel="alternate" title="Recent Commits to DatabaseProj:323d99724fba4b7a8b474336d9a79e37b8558082" type="application/atom+xml" />

  </head>


  <body class="logged_in page-blob windows vis-public env-production ">
    <div id="wrapper">

      

      

      


        <div class="header header-logged-in true">
          <div class="container clearfix">

            <a class="header-logo-blacktocat" href="https://github.com/">
  <span class="mega-icon mega-icon-blacktocat"></span>
</a>

            <div class="divider-vertical"></div>

            
  <a href="/notifications" class="notification-indicator tooltipped downwards" title="You have unread notifications">
    <span class="mail-status unread"></span>
  </a>
  <div class="divider-vertical"></div>


              
  <div class="topsearch command-bar-activated">
    <form accept-charset="UTF-8" action="/search" class="command_bar_form" id="top_search_form" method="get">
  <a href="/search/advanced" class="advanced-search tooltipped downwards command-bar-search" id="advanced_search" title="Advanced search"><span class="mini-icon mini-icon-advanced-search "></span></a>

  <input type="text" name="q" id="command-bar" placeholder="Search or type a command" tabindex="1" data-username="jlschuma" autocapitalize="off">

  <span class="mini-icon help tooltipped downwards" title="Show command bar help">
    <span class="mini-icon mini-icon-help"></span>
  </span>

  <input type="hidden" name="ref" value="commandbar">

  <div class="divider-vertical"></div>
</form>



    <ul class="top-nav">
        <li class="explore"><a href="https://github.com/explore">Explore</a></li>
        <li><a href="https://gist.github.com">Gist</a></li>
        <li><a href="/blog">Blog</a></li>
      <li><a href="http://help.github.com">Help</a></li>
    </ul>
  </div>


            

  
    <ul id="user-links">
      <li>
        <a href="https://github.com/jlschuma" class="name">
          <img height="20" src="https://secure.gravatar.com/avatar/da787e7e502e8adc87a11d2e825a88e5?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="20" /> jlschuma
        </a>
      </li>
      <li>
        <a href="/new" id="new_repo" class="tooltipped downwards" title="Create a new repo">
          <span class="mini-icon mini-icon-create"></span>
        </a>
      </li>
      <li>
        <a href="/settings/profile" id="account_settings"
          class="tooltipped downwards"
          title="Account settings (You have no verified emails)">
          <span class="mini-icon mini-icon-account-settings"></span>
            <span class="setting_warning">!</span>
        </a>
      </li>
      <li>
          <a href="/logout" data-method="post" id="logout" class="tooltipped downwards" title="Sign out">
            <span class="mini-icon mini-icon-logout"></span>
          </a>
      </li>
    </ul>



            
          </div>
        </div>


      <div class="global-notice warn"><div class="global-notice-inner"><h2>You don't have any verified emails.  We recommend <a href="https://github.com/settings/emails">verifying</a> at least one email.</h2><p>Email verification will help our support team help you in case you have any email issues or lose your password.</p></div></div>

      


            <div class="site hfeed" itemscope itemtype="http://schema.org/WebPage">
      <div class="hentry">
        
        <div class="pagehead repohead instapaper_ignore readability-menu">
          <div class="container">
            <div class="title-actions-bar">
              


                  <ul class="pagehead-actions">
          <li class="nspr">
            <a href="/jlschuma/DatabaseProj/pull/new/323d99724fba4b7a8b474336d9a79e37b8558082" class="minibutton btn-pull-request" icon_class="mini-icon-pull-request"><span class="mini-icon mini-icon-pull-request"></span>Pull Request</a>
          </li>

          <li class="subscription">
              <form accept-charset="UTF-8" action="/notifications/subscribe" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="zNYEQdqh3l71CNZf0yl9uQJDsIPYZsOedp01U2lIR/s=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="6582976" />
  <div class="context-menu-container js-menu-container js-context-menu">
    <span class="minibutton switcher bigger js-menu-target">
      <span class="js-context-button">
          <span class="mini-icon mini-icon-unwatch"></span>Unwatch
      </span>
    </span>

    <div class="context-pane js-menu-content">
      <a href="javascript:;" class="close js-menu-close"><span class="mini-icon mini-icon-remove-close"></span></a>
      <div class="context-title">Notification status</div>

      <div class="context-body pane-selector">
        <ul class="js-navigation-container">
          <li class="selector-item js-navigation-item js-navigation-target ">
            <span class="mini-icon mini-icon-confirm"></span>
            <label>
              <input id="do_included" name="do" type="radio" value="included" />
              <h4>Not watching</h4>
              <p>You will only receive notifications when you participate or are mentioned.</p>
            </label>
            <span class="context-button-text js-context-button-text">
              <span class="mini-icon mini-icon-watching"></span>
              Watch
            </span>
          </li>
          <li class="selector-item js-navigation-item js-navigation-target selected">
            <span class="mini-icon mini-icon-confirm"></span>
            <label>
              <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
              <h4>Watching</h4>
              <p>You will receive all notifications for this repository.</p>
            </label>
            <span class="context-button-text js-context-button-text">
              <span class="mini-icon mini-icon-unwatch"></span>
              Unwatch
            </span>
          </li>
          <li class="selector-item js-navigation-item js-navigation-target ">
            <span class="mini-icon mini-icon-confirm"></span>
            <label>
              <input id="do_ignore" name="do" type="radio" value="ignore" />
              <h4>Ignored</h4>
              <p>You will not receive notifications for this repository.</p>
            </label>
            <span class="context-button-text js-context-button-text">
              <span class="mini-icon mini-icon-mute"></span>
              Stop ignoring
            </span>
          </li>
        </ul>
      </div>
    </div>
  </div>
</form>
          </li>

          <li class="js-toggler-container js-social-container starring-container ">
            <a href="/jlschuma/DatabaseProj/unstar" class="minibutton js-toggler-target starred" data-remote="true" data-method="post" rel="nofollow">
              <span class="mini-icon mini-icon-star"></span>Unstar
            </a><a href="/jlschuma/DatabaseProj/star" class="minibutton js-toggler-target unstarred" data-remote="true" data-method="post" rel="nofollow">
              <span class="mini-icon mini-icon-star"></span>Star
            </a><a class="social-count js-social-count" href="/jlschuma/DatabaseProj/stargazers">0</a>
          </li>

              <li><a href="/jlschuma/DatabaseProj/fork" class="minibutton js-toggler-target fork-button lighter" rel="nofollow" data-method="post"><span class="mini-icon mini-icon-fork"></span>Fork</a><a href="/jlschuma/DatabaseProj/network" class="social-count">2</a>
              </li>


    </ul>

              <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
                <span class="repo-label"><span>public</span></span>
                <span class="mega-icon mega-icon-public-repo"></span>
                <span class="author vcard">
                  <a href="/jlschuma" class="url fn" itemprop="url" rel="author">
                  <span itemprop="title">jlschuma</span>
                  </a></span> /
                <strong><a href="/jlschuma/DatabaseProj" class="js-current-repository">DatabaseProj</a></strong>
              </h1>
            </div>

            

  <ul class="tabs">
    <li><a href="/jlschuma/DatabaseProj" class="selected" highlight="repo_sourcerepo_downloadsrepo_commitsrepo_tagsrepo_branches">Code</a></li>
    <li><a href="/jlschuma/DatabaseProj/network" highlight="repo_network">Network</a></li>
    <li><a href="/jlschuma/DatabaseProj/pulls" highlight="repo_pulls">Pull Requests <span class='counter'>0</span></a></li>

      <li><a href="/jlschuma/DatabaseProj/issues" highlight="repo_issues">Issues <span class='counter'>8</span></a></li>

      <li><a href="/jlschuma/DatabaseProj/wiki" highlight="repo_wiki">Wiki</a></li>


    <li><a href="/jlschuma/DatabaseProj/graphs" highlight="repo_graphsrepo_contributors">Graphs</a></li>

      <li>
        <a href="/jlschuma/DatabaseProj/admin">Admin</a>
      </li>

  </ul>
  
<div class="tabnav">

  <span class="tabnav-right">
    <ul class="tabnav-tabs">
      <li><a href="/jlschuma/DatabaseProj/tags" class="tabnav-tab" highlight="repo_tags">Tags <span class="counter blank">0</span></a></li>
      <li><a href="/jlschuma/DatabaseProj/downloads" class="tabnav-tab" highlight="repo_downloads">Downloads <span class="counter blank">0</span></a></li>
    </ul>
    
  </span>

  <div class="tabnav-widget scope">


    <div class="context-menu-container js-menu-container js-context-menu">
      <a href="#"
         class="minibutton bigger switcher js-menu-target js-commitish-button btn-tree repo-tree"
         data-hotkey="w"
         data-ref="">
         <span><em class="mini-icon mini-icon-tree"></em><i>tree:</i> 323d99724f</span>
      </a>

      <div class="context-pane commitish-context js-menu-content">
        <a href="javascript:;" class="close js-menu-close"><span class="mini-icon mini-icon-remove-close"></span></a>
        <div class="context-title">Switch branches/tags</div>
        <div class="context-body pane-selector commitish-selector js-navigation-container">
          <div class="filterbar">
            <input type="text" id="context-commitish-filter-field" class="js-navigation-enable js-filterable-field" placeholder="Filter branches/tags">
            <ul class="tabs">
              <li><a href="#" data-filter="branches" class="selected">Branches</a></li>
                <li><a href="#" data-filter="tags">Tags</a></li>
            </ul>
          </div>

          <div class="js-filter-tab js-filter-branches">
            <div data-filterable-for="context-commitish-filter-field" data-filterable-type=substring>
                <div class="commitish-item branch-commitish selector-item js-navigation-item js-navigation-target ">
                  <span class="mini-icon mini-icon-confirm"></span>
                  <h4>
                      <a href="/jlschuma/DatabaseProj/blob/master/src/com/db/ncsu/Main.java" class="js-navigation-open" data-name="master" rel="nofollow">master</a>
                  </h4>
                </div>
            </div>
            <div class="no-results">Nothing to show</div>
          </div>

            <div class="js-filter-tab js-filter-tags filter-tab-empty" style="display:none">
              <div data-filterable-for="context-commitish-filter-field" data-filterable-type=substring>
              </div>
              <div class="no-results">Nothing to show</div>
            </div>
        </div>
      </div><!-- /.commitish-context-context -->
    </div>
  </div> <!-- /.scope -->

  <ul class="tabnav-tabs">
    <li><a href="/jlschuma/DatabaseProj" class="selected tabnav-tab" highlight="repo_source">Files</a></li>
    <li><a href="/jlschuma/DatabaseProj/commits/" class="tabnav-tab" highlight="repo_commits">Commits</a></li>
    <li><a href="/jlschuma/DatabaseProj/branches" class="tabnav-tab" highlight="repo_branches" rel="nofollow">Branches <span class="counter ">1</span></a></li>
  </ul>

</div>

  
  
  


            
          </div>
        </div><!-- /.repohead -->

        <div id="js-repo-pjax-container" class="container context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:506147c259eed9f9cd0dc2184ba35630 -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:506147c259eed9f9cd0dc2184ba35630 -->

<div id="slider">


    <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>
    <div class="breadcrumb" data-path="src/com/db/ncsu/Main.java/">
      <span class='bold'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jlschuma/DatabaseProj/tree/323d99724fba4b7a8b474336d9a79e37b8558082" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">DatabaseProj</span></a></span></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jlschuma/DatabaseProj/tree/323d99724fba4b7a8b474336d9a79e37b8558082/src" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">src</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jlschuma/DatabaseProj/tree/323d99724fba4b7a8b474336d9a79e37b8558082/src/com" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">com</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jlschuma/DatabaseProj/tree/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">db</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jlschuma/DatabaseProj/tree/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/ncsu" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">ncsu</span></a></span> / <strong class="final-path">Main.java</strong> <span class="js-clippy mini-icon mini-icon-clippy " data-clipboard-text="src/com/db/ncsu/Main.java" data-copied-hint="copied!" data-copy-hint="copy to clipboard"></span>
    </div>

    <a href="/jlschuma/DatabaseProj/find/323d99724fba4b7a8b474336d9a79e37b8558082" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>

      
  <div class="commit file-history-tease" data-path="src/com/db/ncsu/Main.java/">
    <img class="main-avatar" height="24" src="https://secure.gravatar.com/avatar/c8653374d95a3fb069082136f5c7f8f3?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="24" />
    <span class="author"><a href="/eblumpki">eblumpki</a></span>
    <time class="js-relative-date" datetime="2012-11-19T16:32:08-08:00" title="2012-11-19 16:32:08">November 19, 2012</time>
    <div class="commit-title">
        <a href="/jlschuma/DatabaseProj/commit/323d99724fba4b7a8b474336d9a79e37b8558082" class="message">While I'm committing...</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>2</strong> contributors</a></p>
          <a class="avatar tooltipped downwards" title="eblumpki" href="/jlschuma/DatabaseProj/commits/master/src/com/db/ncsu/Main.java?author=eblumpki"><img height="20" src="https://secure.gravatar.com/avatar/c8653374d95a3fb069082136f5c7f8f3?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="20" /></a>
    <a class="avatar tooltipped downwards" title="jlschuma" href="/jlschuma/DatabaseProj/commits/master/src/com/db/ncsu/Main.java?author=jlschuma"><img height="20" src="https://secure.gravatar.com/avatar/da787e7e502e8adc87a11d2e825a88e5?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="20" /></a>


    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2>Users on GitHub who have contributed to this file</h2>
      <ul class="facebox-user-list">
        <li>
          <img height="24" src="https://secure.gravatar.com/avatar/c8653374d95a3fb069082136f5c7f8f3?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="24" />
          <a href="/eblumpki">eblumpki</a>
        </li>
        <li>
          <img height="24" src="https://secure.gravatar.com/avatar/da787e7e502e8adc87a11d2e825a88e5?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="24" />
          <a href="/jlschuma">jlschuma</a>
        </li>
      </ul>
    </div>
  </div>


    <div class="frames">
      <div class="frame frame-center" data-path="src/com/db/ncsu/Main.java/" data-permalink-url="/jlschuma/DatabaseProj/blob/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/ncsu/Main.java" data-title="DatabaseProj/src/com/db/ncsu/Main.java at 323d99724fba4b7a8b474336d9a79e37b8558082 · jlschuma/DatabaseProj · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="mini-icon mini-icon-text-file"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>94 lines (73 sloc)</span>
                <span>2.231 kb</span>
              </div>
              <ul class="button-group actions">
                <li><a href="/jlschuma/DatabaseProj/raw/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/ncsu/Main.java" class="minibutton grouped-button bigger lighter" id="raw-url">Raw</a></li>
                  <li><a href="/jlschuma/DatabaseProj/blame/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/ncsu/Main.java" class="minibutton grouped-button bigger lighter">Blame</a></li>
                <li><a href="/jlschuma/DatabaseProj/commits/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/ncsu/Main.java" class="minibutton grouped-button bigger lighter" rel="nofollow">History</a></li>
              </ul>
            </div>
                <div class="data type-java">
      <table cellpadding="0" cellspacing="0" class="lines">
        <tr>
          <td>
            <pre class="line_numbers"><span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
</pre>
          </td>
          <td width="100%">
                <div class="highlight"><pre><div class='line' id='LC1'><span class="kn">package</span> <span class="n">com</span><span class="o">.</span><span class="na">db</span><span class="o">.</span><span class="na">ncsu</span><span class="o">;</span></div><div class='line' id='LC2'><br/></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">java.util.Scanner</span><span class="o">;</span></div><div class='line' id='LC4'><br/></div><div class='line' id='LC5'><span class="kn">import</span> <span class="nn">com.db.database.DatabaseManager</span><span class="o">;</span></div><div class='line' id='LC6'><span class="kn">import</span> <span class="nn">com.db.ncsu.command.Command</span><span class="o">;</span></div><div class='line' id='LC7'><span class="kn">import</span> <span class="nn">com.db.ncsu.user.User</span><span class="o">;</span></div><div class='line' id='LC8'><span class="kn">import</span> <span class="nn">com.db.ncsu.view.CommandView</span><span class="o">;</span></div><div class='line' id='LC9'><br/></div><div class='line' id='LC10'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Main</span> <span class="o">{</span></div><div class='line' id='LC11'><br/></div><div class='line' id='LC12'><br/></div><div class='line' id='LC13'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="n">userId</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC14'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="n">userStoreId</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC15'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span> <span class="n">department</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC16'><br/></div><div class='line' id='LC17'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span><span class="o">(</span><span class="n">String</span> <span class="n">args</span><span class="o">[])</span></div><div class='line' id='LC18'>	<span class="o">{</span></div><div class='line' id='LC19'>		<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;Enter your Id&quot;</span><span class="o">);</span></div><div class='line' id='LC20'><br/></div><div class='line' id='LC21'><br/></div><div class='line' id='LC22'><br/></div><div class='line' id='LC23'>		<span class="n">Scanner</span> <span class="n">scanner</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Scanner</span><span class="o">(</span><span class="n">System</span><span class="o">.</span><span class="na">in</span><span class="o">);</span></div><div class='line' id='LC24'>		<span class="n">String</span> <span class="n">id</span> <span class="o">=</span> <span class="n">scanner</span><span class="o">.</span><span class="na">nextLine</span><span class="o">();</span></div><div class='line' id='LC25'><br/></div><div class='line' id='LC26'><br/></div><div class='line' id='LC27'>		<span class="c1">// Functions Lookup the type of user - Present a sales user		</span></div><div class='line' id='LC28'>		<span class="n">User</span> <span class="n">user</span> <span class="o">=</span> <span class="k">new</span> <span class="n">User</span><span class="o">();</span></div><div class='line' id='LC29'><br/></div><div class='line' id='LC30'>		<span class="c1">//Look up id, set userId, setstoreId, bring back department</span></div><div class='line' id='LC31'>		<span class="n">department</span> <span class="o">=</span> <span class="n">DatabaseManager</span><span class="o">.</span><span class="na">lookUpUser</span><span class="o">(</span><span class="n">id</span><span class="o">);</span></div><div class='line' id='LC32'><br/></div><div class='line' id='LC33'>		<span class="n">Command</span><span class="o">[]</span> <span class="n">userCommands</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC34'><br/></div><div class='line' id='LC35'>		<span class="k">if</span> <span class="o">(</span><span class="n">department</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;Franchise Manager&quot;</span><span class="o">))</span></div><div class='line' id='LC36'>		<span class="o">{</span></div><div class='line' id='LC37'>			<span class="n">userCommands</span> <span class="o">=</span> <span class="n">user</span><span class="o">.</span><span class="na">getFranchiseCommands</span><span class="o">();</span>  </div><div class='line' id='LC38'>		<span class="o">}</span></div><div class='line' id='LC39'>		<span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">department</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;Manager&quot;</span><span class="o">))</span></div><div class='line' id='LC40'>		<span class="o">{</span></div><div class='line' id='LC41'>			<span class="n">userCommands</span> <span class="o">=</span> <span class="n">user</span><span class="o">.</span><span class="na">managerCommands</span><span class="o">();</span></div><div class='line' id='LC42'>		<span class="o">}</span></div><div class='line' id='LC43'>		<span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">department</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;Billing&quot;</span><span class="o">))</span></div><div class='line' id='LC44'>		<span class="o">{</span></div><div class='line' id='LC45'>			<span class="n">userCommands</span> <span class="o">=</span> <span class="n">user</span><span class="o">.</span><span class="na">billingCommands</span><span class="o">();</span></div><div class='line' id='LC46'>		<span class="o">}</span></div><div class='line' id='LC47'>		<span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">department</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;Sales&quot;</span><span class="o">))</span></div><div class='line' id='LC48'>		<span class="o">{</span></div><div class='line' id='LC49'>			<span class="n">userCommands</span> <span class="o">=</span> <span class="n">user</span><span class="o">.</span><span class="na">getSalesCommands</span><span class="o">();</span></div><div class='line' id='LC50'>		<span class="o">}</span></div><div class='line' id='LC51'>		<span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">department</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;Stocking&quot;</span><span class="o">))</span></div><div class='line' id='LC52'>		<span class="o">{</span></div><div class='line' id='LC53'>			<span class="n">userCommands</span> <span class="o">=</span> <span class="n">user</span><span class="o">.</span><span class="na">stockingCommands</span><span class="o">();</span></div><div class='line' id='LC54'>		<span class="o">}</span></div><div class='line' id='LC55'>		<span class="k">else</span><span class="o">{</span></div><div class='line' id='LC56'>			<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;User does not have a valid account type. Please contact database administrator.&quot;</span><span class="o">);</span></div><div class='line' id='LC57'>			<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC58'>		<span class="o">}</span></div><div class='line' id='LC59'><br/></div><div class='line' id='LC60'><br/></div><div class='line' id='LC61'>		<span class="k">while</span> <span class="o">(</span><span class="kc">true</span><span class="o">)</span></div><div class='line' id='LC62'>		<span class="o">{</span></div><div class='line' id='LC63'>			<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;**** &quot;</span><span class="o">+</span><span class="n">department</span> <span class="o">+</span> <span class="s">&quot; Commands ****&quot;</span><span class="o">);</span></div><div class='line' id='LC64'>			<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;Enter a command&quot;</span><span class="o">);</span></div><div class='line' id='LC65'><br/></div><div class='line' id='LC66'>			<span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC67'>			<span class="k">for</span> <span class="o">(</span><span class="n">Command</span> <span class="n">command</span> <span class="o">:</span> <span class="n">userCommands</span><span class="o">)</span></div><div class='line' id='LC68'>			<span class="o">{</span></div><div class='line' id='LC69'>				<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="n">i</span> <span class="o">+</span> <span class="s">&quot; &quot;</span><span class="o">+</span> <span class="n">command</span><span class="o">.</span><span class="na">getCommandName</span><span class="o">());</span></div><div class='line' id='LC70'>				<span class="n">i</span><span class="o">++;</span></div><div class='line' id='LC71'>			<span class="o">}</span></div><div class='line' id='LC72'>			<span class="n">String</span> <span class="n">chosenCommand</span> <span class="o">=</span> <span class="n">scanner</span><span class="o">.</span><span class="na">nextLine</span><span class="o">();</span></div><div class='line' id='LC73'>			<span class="kt">int</span> <span class="n">choosenCommand</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC74'>			<span class="k">try</span><span class="o">{</span></div><div class='line' id='LC75'>				<span class="n">choosenCommand</span> <span class="o">=</span> <span class="n">Integer</span><span class="o">.</span><span class="na">parseInt</span><span class="o">(</span><span class="n">chosenCommand</span><span class="o">);</span></div><div class='line' id='LC76'>			<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">NumberFormatException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC77'>				<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;Incorrect input. Please enter the number of an option.&quot;</span><span class="o">);</span></div><div class='line' id='LC78'>				<span class="k">continue</span><span class="o">;</span></div><div class='line' id='LC79'>			<span class="o">}</span></div><div class='line' id='LC80'>			<span class="k">if</span><span class="o">(</span><span class="n">choosenCommand</span> <span class="o">&lt;=</span> <span class="n">userCommands</span><span class="o">.</span><span class="na">length</span> <span class="o">&amp;&amp;</span> <span class="n">choosenCommand</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">){</span></div><div class='line' id='LC81'>				<span class="n">Command</span> <span class="n">commandToExecute</span> <span class="o">=</span> <span class="n">userCommands</span><span class="o">[</span><span class="n">choosenCommand</span><span class="o">-</span><span class="mi">1</span><span class="o">];</span></div><div class='line' id='LC82'>				<span class="n">CommandView</span> <span class="n">commandView</span> <span class="o">=</span> <span class="k">new</span> <span class="n">CommandView</span><span class="o">();</span></div><div class='line' id='LC83'>				<span class="n">commandView</span><span class="o">.</span><span class="na">enterParametersAndExeute</span><span class="o">(</span><span class="n">commandToExecute</span><span class="o">);</span></div><div class='line' id='LC84'>			<span class="o">}</span></div><div class='line' id='LC85'>			<span class="k">else</span><span class="o">{</span></div><div class='line' id='LC86'>				<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;Option number does not exist. Please try again.&quot;</span><span class="o">);</span></div><div class='line' id='LC87'>			<span class="o">}</span></div><div class='line' id='LC88'><br/></div><div class='line' id='LC89'>		<span class="o">}</span></div><div class='line' id='LC90'>	<span class="o">}</span></div><div class='line' id='LC91'><br/></div><div class='line' id='LC92'><br/></div><div class='line' id='LC93'><span class="o">}</span></div></pre></div>
          </td>
        </tr>
      </table>
  </div>

          </div>
        </div>
      </div>

      <a href="#jump-to-line" rel="facebox" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
      <div id="jump-to-line" style="display:none">
        <h2>Jump to Line</h2>
        <form accept-charset="UTF-8" class="js-jump-to-line-form">
          <input class="textfield js-jump-to-line-field" type="text">
          <div class="full-button">
            <button type="submit" class="classy">
              Go
            </button>
          </div>
        </form>
      </div>

    </div>
</div>

<div class="frame frame-loading large-loading-area" style="display:none;">
  <img src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-128.gif?1347543527" height="64" width="64">
</div>

        </div>
      </div>
      <div class="context-overlay"></div>
    </div>

      <div id="footer-push"></div><!-- hack for sticky footer -->
    </div><!-- end of wrapper - hack for sticky footer -->

      <!-- footer -->
      <div id="footer">
  <div class="container clearfix">

      <dl class="footer_nav">
        <dt>GitHub</dt>
        <dd><a href="https://github.com/about">About us</a></dd>
        <dd><a href="https://github.com/blog">Blog</a></dd>
        <dd><a href="https://github.com/contact">Contact &amp; support</a></dd>
        <dd><a href="http://enterprise.github.com/">GitHub Enterprise</a></dd>
        <dd><a href="http://status.github.com/">Site status</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Applications</dt>
        <dd><a href="http://mac.github.com/">GitHub for Mac</a></dd>
        <dd><a href="http://windows.github.com/">GitHub for Windows</a></dd>
        <dd><a href="http://eclipse.github.com/">GitHub for Eclipse</a></dd>
        <dd><a href="http://mobile.github.com/">GitHub mobile apps</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Services</dt>
        <dd><a href="http://get.gaug.es/">Gauges: Web analytics</a></dd>
        <dd><a href="http://speakerdeck.com">Speaker Deck: Presentations</a></dd>
        <dd><a href="https://gist.github.com">Gist: Code snippets</a></dd>
        <dd><a href="http://jobs.github.com/">Job board</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Documentation</dt>
        <dd><a href="http://help.github.com/">GitHub Help</a></dd>
        <dd><a href="http://developer.github.com/">Developer API</a></dd>
        <dd><a href="http://github.github.com/github-flavored-markdown/">GitHub Flavored Markdown</a></dd>
        <dd><a href="http://pages.github.com/">GitHub Pages</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>More</dt>
        <dd><a href="http://training.github.com/">Training</a></dd>
        <dd><a href="https://github.com/edu">Students &amp; teachers</a></dd>
        <dd><a href="http://shop.github.com">The Shop</a></dd>
        <dd><a href="http://octodex.github.com/">The Octodex</a></dd>
      </dl>

      <hr class="footer-divider">


    <p class="right">&copy; 2012 <span title="0.06288s from fe2.rs.github.com">GitHub</span> Inc. All rights reserved.</p>
    <a class="left" href="https://github.com/">
      <span class="mega-icon mega-icon-invertocat"></span>
    </a>
    <ul id="legal">
        <li><a href="https://github.com/site/terms">Terms of Service</a></li>
        <li><a href="https://github.com/site/privacy">Privacy</a></li>
        <li><a href="https://github.com/security">Security</a></li>
    </ul>

  </div><!-- /.container -->

</div><!-- /.#footer -->


    

<div id="keyboard_shortcuts_pane" class="instapaper_ignore readability-extra" style="display:none">
  <h2>Keyboard Shortcuts <small><a href="#" class="js-see-all-keyboard-shortcuts">(see all)</a></small></h2>

  <div class="columns threecols">
    <div class="column first">
      <h3>Site wide shortcuts</h3>
      <dl class="keyboard-mappings">
        <dt>s</dt>
        <dd>Focus command bar</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>?</dt>
        <dd>Bring up this help dialog</dd>
      </dl>
    </div><!-- /.column.first -->

    <div class="column middle" style='display:none'>
      <h3>Commit list</h3>
      <dl class="keyboard-mappings">
        <dt>j</dt>
        <dd>Move selection down</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>k</dt>
        <dd>Move selection up</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>c <em>or</em> o <em>or</em> enter</dt>
        <dd>Open commit</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>y</dt>
        <dd>Expand URL to its canonical form</dd>
      </dl>
    </div><!-- /.column.first -->

    <div class="column last js-hidden-pane" style='display:none'>
      <h3>Pull request list</h3>
      <dl class="keyboard-mappings">
        <dt>j</dt>
        <dd>Move selection down</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>k</dt>
        <dd>Move selection up</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>o <em>or</em> enter</dt>
        <dd>Open issue</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> enter</dt>
        <dd>Submit comment</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> shift p</dt>
        <dd>Preview comment</dd>
      </dl>
    </div><!-- /.columns.last -->

  </div><!-- /.columns.equacols -->

  <div class="js-hidden-pane" style='display:none'>
    <div class="rule"></div>

    <h3>Issues</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selection down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selection up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>x</dt>
          <dd>Toggle selection</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open issue</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> enter</dt>
          <dd>Submit comment</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> shift p</dt>
          <dd>Preview comment</dd>
        </dl>
      </div><!-- /.column.first -->
      <div class="column last">
        <dl class="keyboard-mappings">
          <dt>c</dt>
          <dd>Create issue</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>l</dt>
          <dd>Create label</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>i</dt>
          <dd>Back to inbox</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>u</dt>
          <dd>Back to issues</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>/</dt>
          <dd>Focus issues search</dd>
        </dl>
      </div>
    </div>
  </div>

  <div class="js-hidden-pane" style='display:none'>
    <div class="rule"></div>

    <h3>Issues Dashboard</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selection down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selection up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open issue</dd>
        </dl>
      </div><!-- /.column.first -->
    </div>
  </div>

  <div class="js-hidden-pane" style='display:none'>
    <div class="rule"></div>

    <h3>Network Graph</h3>
    <div class="columns equacols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt><span class="badmono">←</span> <em>or</em> h</dt>
          <dd>Scroll left</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">→</span> <em>or</em> l</dt>
          <dd>Scroll right</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">↑</span> <em>or</em> k</dt>
          <dd>Scroll up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">↓</span> <em>or</em> j</dt>
          <dd>Scroll down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>t</dt>
          <dd>Toggle visibility of head labels</dd>
        </dl>
      </div><!-- /.column.first -->
      <div class="column last">
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">←</span> <em>or</em> shift h</dt>
          <dd>Scroll all the way left</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">→</span> <em>or</em> shift l</dt>
          <dd>Scroll all the way right</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">↑</span> <em>or</em> shift k</dt>
          <dd>Scroll all the way up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">↓</span> <em>or</em> shift j</dt>
          <dd>Scroll all the way down</dd>
        </dl>
      </div><!-- /.column.last -->
    </div>
  </div>

  <div class="js-hidden-pane" >
    <div class="rule"></div>
    <div class="columns threecols">
      <div class="column first js-hidden-pane" >
        <h3>Source Code Browsing</h3>
        <dl class="keyboard-mappings">
          <dt>t</dt>
          <dd>Activates the file finder</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>l</dt>
          <dd>Jump to line</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>w</dt>
          <dd>Switch branch/tag</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>y</dt>
          <dd>Expand URL to its canonical form</dd>
        </dl>
      </div>
    </div>
  </div>

  <div class="js-hidden-pane" style='display:none'>
    <div class="rule"></div>
    <div class="columns threecols">
      <div class="column first">
        <h3>Browsing Commits</h3>
        <dl class="keyboard-mappings">
          <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> enter</dt>
          <dd>Submit comment</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>escape</dt>
          <dd>Close form</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>p</dt>
          <dd>Parent commit</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o</dt>
          <dd>Other parent commit</dd>
        </dl>
      </div>
    </div>
  </div>

  <div class="js-hidden-pane" style='display:none'>
    <div class="rule"></div>
    <h3>Notifications</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selection down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selection up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open notification</dd>
        </dl>
      </div><!-- /.column.first -->

      <div class="column second">
        <dl class="keyboard-mappings">
          <dt>e <em>or</em> shift i <em>or</em> y</dt>
          <dd>Mark as read</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift m</dt>
          <dd>Mute thread</dd>
        </dl>
      </div><!-- /.column.first -->
    </div>
  </div>

</div>

    <div id="markdown-help" class="instapaper_ignore readability-extra">
  <h2>Markdown Cheat Sheet</h2>

  <div class="cheatsheet-content">

  <div class="mod">
    <div class="col">
      <h3>Format Text</h3>
      <p>Headers</p>
      <pre>
# This is an &lt;h1&gt; tag
## This is an &lt;h2&gt; tag
###### This is an &lt;h6&gt; tag</pre>
     <p>Text styles</p>
     <pre>
*This text will be italic*
_This will also be italic_
**This text will be bold**
__This will also be bold__

*You **can** combine them*
</pre>
    </div>
    <div class="col">
      <h3>Lists</h3>
      <p>Unordered</p>
      <pre>
* Item 1
* Item 2
  * Item 2a
  * Item 2b</pre>
     <p>Ordered</p>
     <pre>
1. Item 1
2. Item 2
3. Item 3
   * Item 3a
   * Item 3b</pre>
    </div>
    <div class="col">
      <h3>Miscellaneous</h3>
      <p>Images</p>
      <pre>
![GitHub Logo](/images/logo.png)
Format: ![Alt Text](url)
</pre>
     <p>Links</p>
     <pre>
http://github.com - automatic!
[GitHub](http://github.com)</pre>
<p>Blockquotes</p>
     <pre>
As Kanye West said:

> We're living the future so
> the present is our past.
</pre>
    </div>
  </div>
  <div class="rule"></div>

  <h3>Code Examples in Markdown</h3>
  <div class="col">
      <p>Syntax highlighting with <a href="http://github.github.com/github-flavored-markdown/" title="GitHub Flavored Markdown" target="_blank">GFM</a></p>
      <pre>
```javascript
function fancyAlert(arg) {
  if(arg) {
    $.facebox({div:'#foo'})
  }
}
```</pre>
    </div>
    <div class="col">
      <p>Or, indent your code 4 spaces</p>
      <pre>
Here is a Python code example
without syntax highlighting:

    def foo:
      if not bar:
        return true</pre>
    </div>
    <div class="col">
      <p>Inline code for comments</p>
      <pre>
I think you should use an
`&lt;addr&gt;` element here instead.</pre>
    </div>
  </div>

  </div>
</div>


    <div id="ajax-error-message" class="flash flash-error">
      <span class="mini-icon mini-icon-exclamation"></span>
      Something went wrong with that request. Please try again.
      <a href="#" class="mini-icon mini-icon-remove-close ajax-error-dismiss"></a>
    </div>

    
    
    <span id='server_response_time' data-time='0.06406' data-host='fe2'></span>
    
  </body>
</html>

