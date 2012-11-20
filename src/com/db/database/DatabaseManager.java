  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>DatabaseProj/src/com/db/database/DatabaseManager.java at 323d99724fba4b7a8b474336d9a79e37b8558082 · jlschuma/DatabaseProj</title>
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
    

      <link rel='permalink' href='/jlschuma/DatabaseProj/blob/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/database/DatabaseManager.java'>
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
                      <a href="/jlschuma/DatabaseProj/blob/master/src/com/db/database/DatabaseManager.java" class="js-navigation-open" data-name="master" rel="nofollow">master</a>
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
          


<!-- blob contrib key: blob_contributors:v21:222d09e6eca33a3d727b76892a00172f -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:222d09e6eca33a3d727b76892a00172f -->

<div id="slider">


    <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>
    <div class="breadcrumb" data-path="src/com/db/database/DatabaseManager.java/">
      <span class='bold'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jlschuma/DatabaseProj/tree/323d99724fba4b7a8b474336d9a79e37b8558082" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">DatabaseProj</span></a></span></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jlschuma/DatabaseProj/tree/323d99724fba4b7a8b474336d9a79e37b8558082/src" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">src</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jlschuma/DatabaseProj/tree/323d99724fba4b7a8b474336d9a79e37b8558082/src/com" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">com</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jlschuma/DatabaseProj/tree/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">db</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jlschuma/DatabaseProj/tree/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/database" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">database</span></a></span> / <strong class="final-path">DatabaseManager.java</strong> <span class="js-clippy mini-icon mini-icon-clippy " data-clipboard-text="src/com/db/database/DatabaseManager.java" data-copied-hint="copied!" data-copy-hint="copy to clipboard"></span>
    </div>

    <a href="/jlschuma/DatabaseProj/find/323d99724fba4b7a8b474336d9a79e37b8558082" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>

      
  <div class="commit file-history-tease" data-path="src/com/db/database/DatabaseManager.java/">
    <img class="main-avatar" height="24" src="https://secure.gravatar.com/avatar/c8653374d95a3fb069082136f5c7f8f3?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="24" />
    <span class="author"><a href="/eblumpki">eblumpki</a></span>
    <time class="js-relative-date" datetime="2012-11-19T16:28:58-08:00" title="2012-11-19 16:28:58">November 19, 2012</time>
    <div class="commit-title">
        <a href="/jlschuma/DatabaseProj/commit/3e0594dcaf63239a5c8b28f26102ebb6ab74a750" class="message">Added user lookup</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>2</strong> contributors</a></p>
          <a class="avatar tooltipped downwards" title="eblumpki" href="/jlschuma/DatabaseProj/commits/master/src/com/db/database/DatabaseManager.java?author=eblumpki"><img height="20" src="https://secure.gravatar.com/avatar/c8653374d95a3fb069082136f5c7f8f3?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="20" /></a>
    <a class="avatar tooltipped downwards" title="jlschuma" href="/jlschuma/DatabaseProj/commits/master/src/com/db/database/DatabaseManager.java?author=jlschuma"><img height="20" src="https://secure.gravatar.com/avatar/da787e7e502e8adc87a11d2e825a88e5?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="20" /></a>


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
      <div class="frame frame-center" data-path="src/com/db/database/DatabaseManager.java/" data-permalink-url="/jlschuma/DatabaseProj/blob/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/database/DatabaseManager.java" data-title="DatabaseProj/src/com/db/database/DatabaseManager.java at 323d99724fba4b7a8b474336d9a79e37b8558082 · jlschuma/DatabaseProj · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="mini-icon mini-icon-text-file"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>402 lines (344 sloc)</span>
                <span>9.121 kb</span>
              </div>
              <ul class="button-group actions">
                <li><a href="/jlschuma/DatabaseProj/raw/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/database/DatabaseManager.java" class="minibutton grouped-button bigger lighter" id="raw-url">Raw</a></li>
                  <li><a href="/jlschuma/DatabaseProj/blame/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/database/DatabaseManager.java" class="minibutton grouped-button bigger lighter">Blame</a></li>
                <li><a href="/jlschuma/DatabaseProj/commits/323d99724fba4b7a8b474336d9a79e37b8558082/src/com/db/database/DatabaseManager.java" class="minibutton grouped-button bigger lighter" rel="nofollow">History</a></li>
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
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>
<span id="L197" rel="#L197">197</span>
<span id="L198" rel="#L198">198</span>
<span id="L199" rel="#L199">199</span>
<span id="L200" rel="#L200">200</span>
<span id="L201" rel="#L201">201</span>
<span id="L202" rel="#L202">202</span>
<span id="L203" rel="#L203">203</span>
<span id="L204" rel="#L204">204</span>
<span id="L205" rel="#L205">205</span>
<span id="L206" rel="#L206">206</span>
<span id="L207" rel="#L207">207</span>
<span id="L208" rel="#L208">208</span>
<span id="L209" rel="#L209">209</span>
<span id="L210" rel="#L210">210</span>
<span id="L211" rel="#L211">211</span>
<span id="L212" rel="#L212">212</span>
<span id="L213" rel="#L213">213</span>
<span id="L214" rel="#L214">214</span>
<span id="L215" rel="#L215">215</span>
<span id="L216" rel="#L216">216</span>
<span id="L217" rel="#L217">217</span>
<span id="L218" rel="#L218">218</span>
<span id="L219" rel="#L219">219</span>
<span id="L220" rel="#L220">220</span>
<span id="L221" rel="#L221">221</span>
<span id="L222" rel="#L222">222</span>
<span id="L223" rel="#L223">223</span>
<span id="L224" rel="#L224">224</span>
<span id="L225" rel="#L225">225</span>
<span id="L226" rel="#L226">226</span>
<span id="L227" rel="#L227">227</span>
<span id="L228" rel="#L228">228</span>
<span id="L229" rel="#L229">229</span>
<span id="L230" rel="#L230">230</span>
<span id="L231" rel="#L231">231</span>
<span id="L232" rel="#L232">232</span>
<span id="L233" rel="#L233">233</span>
<span id="L234" rel="#L234">234</span>
<span id="L235" rel="#L235">235</span>
<span id="L236" rel="#L236">236</span>
<span id="L237" rel="#L237">237</span>
<span id="L238" rel="#L238">238</span>
<span id="L239" rel="#L239">239</span>
<span id="L240" rel="#L240">240</span>
<span id="L241" rel="#L241">241</span>
<span id="L242" rel="#L242">242</span>
<span id="L243" rel="#L243">243</span>
<span id="L244" rel="#L244">244</span>
<span id="L245" rel="#L245">245</span>
<span id="L246" rel="#L246">246</span>
<span id="L247" rel="#L247">247</span>
<span id="L248" rel="#L248">248</span>
<span id="L249" rel="#L249">249</span>
<span id="L250" rel="#L250">250</span>
<span id="L251" rel="#L251">251</span>
<span id="L252" rel="#L252">252</span>
<span id="L253" rel="#L253">253</span>
<span id="L254" rel="#L254">254</span>
<span id="L255" rel="#L255">255</span>
<span id="L256" rel="#L256">256</span>
<span id="L257" rel="#L257">257</span>
<span id="L258" rel="#L258">258</span>
<span id="L259" rel="#L259">259</span>
<span id="L260" rel="#L260">260</span>
<span id="L261" rel="#L261">261</span>
<span id="L262" rel="#L262">262</span>
<span id="L263" rel="#L263">263</span>
<span id="L264" rel="#L264">264</span>
<span id="L265" rel="#L265">265</span>
<span id="L266" rel="#L266">266</span>
<span id="L267" rel="#L267">267</span>
<span id="L268" rel="#L268">268</span>
<span id="L269" rel="#L269">269</span>
<span id="L270" rel="#L270">270</span>
<span id="L271" rel="#L271">271</span>
<span id="L272" rel="#L272">272</span>
<span id="L273" rel="#L273">273</span>
<span id="L274" rel="#L274">274</span>
<span id="L275" rel="#L275">275</span>
<span id="L276" rel="#L276">276</span>
<span id="L277" rel="#L277">277</span>
<span id="L278" rel="#L278">278</span>
<span id="L279" rel="#L279">279</span>
<span id="L280" rel="#L280">280</span>
<span id="L281" rel="#L281">281</span>
<span id="L282" rel="#L282">282</span>
<span id="L283" rel="#L283">283</span>
<span id="L284" rel="#L284">284</span>
<span id="L285" rel="#L285">285</span>
<span id="L286" rel="#L286">286</span>
<span id="L287" rel="#L287">287</span>
<span id="L288" rel="#L288">288</span>
<span id="L289" rel="#L289">289</span>
<span id="L290" rel="#L290">290</span>
<span id="L291" rel="#L291">291</span>
<span id="L292" rel="#L292">292</span>
<span id="L293" rel="#L293">293</span>
<span id="L294" rel="#L294">294</span>
<span id="L295" rel="#L295">295</span>
<span id="L296" rel="#L296">296</span>
<span id="L297" rel="#L297">297</span>
<span id="L298" rel="#L298">298</span>
<span id="L299" rel="#L299">299</span>
<span id="L300" rel="#L300">300</span>
<span id="L301" rel="#L301">301</span>
<span id="L302" rel="#L302">302</span>
<span id="L303" rel="#L303">303</span>
<span id="L304" rel="#L304">304</span>
<span id="L305" rel="#L305">305</span>
<span id="L306" rel="#L306">306</span>
<span id="L307" rel="#L307">307</span>
<span id="L308" rel="#L308">308</span>
<span id="L309" rel="#L309">309</span>
<span id="L310" rel="#L310">310</span>
<span id="L311" rel="#L311">311</span>
<span id="L312" rel="#L312">312</span>
<span id="L313" rel="#L313">313</span>
<span id="L314" rel="#L314">314</span>
<span id="L315" rel="#L315">315</span>
<span id="L316" rel="#L316">316</span>
<span id="L317" rel="#L317">317</span>
<span id="L318" rel="#L318">318</span>
<span id="L319" rel="#L319">319</span>
<span id="L320" rel="#L320">320</span>
<span id="L321" rel="#L321">321</span>
<span id="L322" rel="#L322">322</span>
<span id="L323" rel="#L323">323</span>
<span id="L324" rel="#L324">324</span>
<span id="L325" rel="#L325">325</span>
<span id="L326" rel="#L326">326</span>
<span id="L327" rel="#L327">327</span>
<span id="L328" rel="#L328">328</span>
<span id="L329" rel="#L329">329</span>
<span id="L330" rel="#L330">330</span>
<span id="L331" rel="#L331">331</span>
<span id="L332" rel="#L332">332</span>
<span id="L333" rel="#L333">333</span>
<span id="L334" rel="#L334">334</span>
<span id="L335" rel="#L335">335</span>
<span id="L336" rel="#L336">336</span>
<span id="L337" rel="#L337">337</span>
<span id="L338" rel="#L338">338</span>
<span id="L339" rel="#L339">339</span>
<span id="L340" rel="#L340">340</span>
<span id="L341" rel="#L341">341</span>
<span id="L342" rel="#L342">342</span>
<span id="L343" rel="#L343">343</span>
<span id="L344" rel="#L344">344</span>
<span id="L345" rel="#L345">345</span>
<span id="L346" rel="#L346">346</span>
<span id="L347" rel="#L347">347</span>
<span id="L348" rel="#L348">348</span>
<span id="L349" rel="#L349">349</span>
<span id="L350" rel="#L350">350</span>
<span id="L351" rel="#L351">351</span>
<span id="L352" rel="#L352">352</span>
<span id="L353" rel="#L353">353</span>
<span id="L354" rel="#L354">354</span>
<span id="L355" rel="#L355">355</span>
<span id="L356" rel="#L356">356</span>
<span id="L357" rel="#L357">357</span>
<span id="L358" rel="#L358">358</span>
<span id="L359" rel="#L359">359</span>
<span id="L360" rel="#L360">360</span>
<span id="L361" rel="#L361">361</span>
<span id="L362" rel="#L362">362</span>
<span id="L363" rel="#L363">363</span>
<span id="L364" rel="#L364">364</span>
<span id="L365" rel="#L365">365</span>
<span id="L366" rel="#L366">366</span>
<span id="L367" rel="#L367">367</span>
<span id="L368" rel="#L368">368</span>
<span id="L369" rel="#L369">369</span>
<span id="L370" rel="#L370">370</span>
<span id="L371" rel="#L371">371</span>
<span id="L372" rel="#L372">372</span>
<span id="L373" rel="#L373">373</span>
<span id="L374" rel="#L374">374</span>
<span id="L375" rel="#L375">375</span>
<span id="L376" rel="#L376">376</span>
<span id="L377" rel="#L377">377</span>
<span id="L378" rel="#L378">378</span>
<span id="L379" rel="#L379">379</span>
<span id="L380" rel="#L380">380</span>
<span id="L381" rel="#L381">381</span>
<span id="L382" rel="#L382">382</span>
<span id="L383" rel="#L383">383</span>
<span id="L384" rel="#L384">384</span>
<span id="L385" rel="#L385">385</span>
<span id="L386" rel="#L386">386</span>
<span id="L387" rel="#L387">387</span>
<span id="L388" rel="#L388">388</span>
<span id="L389" rel="#L389">389</span>
<span id="L390" rel="#L390">390</span>
<span id="L391" rel="#L391">391</span>
<span id="L392" rel="#L392">392</span>
<span id="L393" rel="#L393">393</span>
<span id="L394" rel="#L394">394</span>
<span id="L395" rel="#L395">395</span>
<span id="L396" rel="#L396">396</span>
<span id="L397" rel="#L397">397</span>
<span id="L398" rel="#L398">398</span>
<span id="L399" rel="#L399">399</span>
<span id="L400" rel="#L400">400</span>
<span id="L401" rel="#L401">401</span>
</pre>
          </td>
          <td width="100%">
                <div class="highlight"><pre><div class='line' id='LC1'><span class="kn">package</span> <span class="n">com</span><span class="o">.</span><span class="na">db</span><span class="o">.</span><span class="na">database</span><span class="o">;</span></div><div class='line' id='LC2'><br/></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">java.sql.Connection</span><span class="o">;</span></div><div class='line' id='LC4'><span class="kn">import</span> <span class="nn">java.sql.Date</span><span class="o">;</span></div><div class='line' id='LC5'><span class="kn">import</span> <span class="nn">java.sql.DriverManager</span><span class="o">;</span></div><div class='line' id='LC6'><span class="kn">import</span> <span class="nn">java.sql.ParameterMetaData</span><span class="o">;</span></div><div class='line' id='LC7'><span class="kn">import</span> <span class="nn">java.sql.PreparedStatement</span><span class="o">;</span></div><div class='line' id='LC8'><span class="kn">import</span> <span class="nn">java.sql.ResultSet</span><span class="o">;</span></div><div class='line' id='LC9'><span class="kn">import</span> <span class="nn">java.sql.ResultSetMetaData</span><span class="o">;</span></div><div class='line' id='LC10'><span class="kn">import</span> <span class="nn">java.sql.SQLException</span><span class="o">;</span></div><div class='line' id='LC11'><span class="kn">import</span> <span class="nn">java.sql.Statement</span><span class="o">;</span></div><div class='line' id='LC12'><span class="kn">import</span> <span class="nn">java.text.ParseException</span><span class="o">;</span></div><div class='line' id='LC13'><span class="kn">import</span> <span class="nn">java.text.SimpleDateFormat</span><span class="o">;</span></div><div class='line' id='LC14'><span class="kn">import</span> <span class="nn">java.util.ArrayList</span><span class="o">;</span></div><div class='line' id='LC15'><span class="kn">import</span> <span class="nn">java.util.regex.Pattern</span><span class="o">;</span></div><div class='line' id='LC16'><br/></div><div class='line' id='LC17'><span class="kn">import</span> <span class="nn">com.db.ncsu.Main</span><span class="o">;</span></div><div class='line' id='LC18'><span class="kn">import</span> <span class="nn">com.db.ncsu.command.CommandArgument</span><span class="o">;</span></div><div class='line' id='LC19'><br/></div><div class='line' id='LC20'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">DatabaseManager</span> <span class="o">{</span></div><div class='line' id='LC21'>	<span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">jdbcURL</span> <span class="o">=</span> <span class="s">&quot;jdbc:oracle:thin:@ora.csc.ncsu.edu:1521:orcl&quot;</span><span class="o">;</span></div><div class='line' id='LC22'><br/></div><div class='line' id='LC23'><br/></div><div class='line' id='LC24'>	<span class="c1">// Put your oracle ID and password here</span></div><div class='line' id='LC25'>	<span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">user</span> <span class="o">=</span> <span class="s">&quot;jlschuma&quot;</span><span class="o">;</span></div><div class='line' id='LC26'>	<span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">password</span> <span class="o">=</span> <span class="s">&quot;test123&quot;</span><span class="o">;</span></div><div class='line' id='LC27'><br/></div><div class='line' id='LC28'>	<span class="kd">private</span> <span class="kd">static</span> <span class="n">Connection</span> <span class="n">connection</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC29'>	<span class="kd">private</span> <span class="kd">static</span> <span class="n">Statement</span> <span class="n">statement</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC30'>	<span class="kd">private</span> <span class="kd">static</span> <span class="n">ResultSet</span> <span class="n">result</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC31'><br/></div><div class='line' id='LC32'><br/></div><div class='line' id='LC33'>	<span class="kd">private</span> <span class="kd">static</span> <span class="n">DatabaseManager</span> <span class="n">dm</span> <span class="o">=</span> <span class="k">new</span> <span class="n">DatabaseManager</span><span class="o">();</span></div><div class='line' id='LC34'>	<span class="kd">static</span> <span class="n">SimpleDateFormat</span> <span class="n">format</span> <span class="o">=</span></div><div class='line' id='LC35'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">new</span> <span class="nf">SimpleDateFormat</span><span class="o">(</span><span class="s">&quot;MM/dd/yy&quot;</span><span class="o">);</span></div><div class='line' id='LC36'><br/></div><div class='line' id='LC37'>	<span class="kd">private</span> <span class="nf">DatabaseManager</span><span class="o">()</span></div><div class='line' id='LC38'>	<span class="o">{</span></div><div class='line' id='LC39'>		<span class="n">initialize</span><span class="o">();</span>	</div><div class='line' id='LC40'>	<span class="o">}</span></div><div class='line' id='LC41'><br/></div><div class='line' id='LC42'>	<span class="kd">private</span> <span class="kd">static</span> <span class="n">PreparedStatement</span> <span class="nf">setPreparedStatementArgument</span><span class="o">(</span><span class="n">PreparedStatement</span> <span class="n">stat</span><span class="o">,</span> <span class="n">CommandArgument</span> <span class="n">arg</span><span class="o">,</span> <span class="kt">int</span> <span class="n">spot</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">NumberFormatException</span><span class="o">,</span> <span class="n">SQLException</span>	</div><div class='line' id='LC43'>	<span class="o">{</span>	</div><div class='line' id='LC44'>		    <span class="k">if</span> <span class="o">(</span><span class="n">arg</span><span class="o">.</span><span class="na">getType</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;Int&quot;</span><span class="o">))</span></div><div class='line' id='LC45'>			<span class="o">{</span></div><div class='line' id='LC46'><br/></div><div class='line' id='LC47'>				<span class="n">stat</span><span class="o">.</span><span class="na">setInt</span><span class="o">(</span><span class="n">spot</span><span class="o">,</span> <span class="n">Integer</span><span class="o">.</span><span class="na">parseInt</span><span class="o">(</span><span class="n">arg</span><span class="o">.</span><span class="na">getValue</span><span class="o">().</span><span class="na">toString</span><span class="o">()));</span></div><div class='line' id='LC48'>				<span class="c1">//sql = sql.replaceFirst(Pattern.quote(&quot;?&quot;), arg.getValue().toString());</span></div><div class='line' id='LC49'>			<span class="o">}</span></div><div class='line' id='LC50'>			<span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">arg</span><span class="o">.</span><span class="na">getType</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;String&quot;</span><span class="o">))</span></div><div class='line' id='LC51'>			<span class="o">{</span></div><div class='line' id='LC52'>				<span class="k">if</span> <span class="o">(</span><span class="n">arg</span><span class="o">.</span><span class="na">getValue</span><span class="o">()</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></div><div class='line' id='LC53'>				<span class="o">{</span></div><div class='line' id='LC54'>					<span class="n">stat</span><span class="o">.</span><span class="na">setString</span><span class="o">(</span><span class="n">spot</span><span class="o">,</span> <span class="kc">null</span><span class="o">);</span></div><div class='line' id='LC55'>				<span class="o">}</span></div><div class='line' id='LC56'>				<span class="k">else</span></div><div class='line' id='LC57'>				<span class="o">{</span></div><div class='line' id='LC58'>					<span class="n">stat</span><span class="o">.</span><span class="na">setString</span><span class="o">(</span><span class="n">spot</span><span class="o">,</span> <span class="n">arg</span><span class="o">.</span><span class="na">getValue</span><span class="o">().</span><span class="na">toString</span><span class="o">());</span></div><div class='line' id='LC59'>				<span class="o">}</span></div><div class='line' id='LC60'>				<span class="c1">///sql = sql.replaceFirst(Pattern.quote(&quot;?&quot;), &quot;&#39;&quot;+arg.getValue().toString()+&quot;&#39;&quot;);</span></div><div class='line' id='LC61'>			<span class="o">}</span></div><div class='line' id='LC62'>			<span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">arg</span><span class="o">.</span><span class="na">getType</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;Float&quot;</span><span class="o">))</span></div><div class='line' id='LC63'>			<span class="o">{</span></div><div class='line' id='LC64'>				<span class="n">stat</span><span class="o">.</span><span class="na">setFloat</span><span class="o">(</span><span class="n">spot</span><span class="o">,</span> <span class="n">Float</span><span class="o">.</span><span class="na">parseFloat</span><span class="o">(</span><span class="n">arg</span><span class="o">.</span><span class="na">getValue</span><span class="o">().</span><span class="na">toString</span><span class="o">()));</span></div><div class='line' id='LC65'>			<span class="o">}</span></div><div class='line' id='LC66'>			<span class="k">else</span> <span class="nf">if</span> <span class="o">(</span><span class="n">arg</span><span class="o">.</span><span class="na">getType</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;Date&quot;</span><span class="o">))</span></div><div class='line' id='LC67'>			<span class="o">{</span></div><div class='line' id='LC68'>				<span class="k">if</span> <span class="o">(</span><span class="n">arg</span><span class="o">.</span><span class="na">getValue</span><span class="o">()</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></div><div class='line' id='LC69'>				<span class="o">{</span></div><div class='line' id='LC70'>					<span class="n">stat</span><span class="o">.</span><span class="na">setDate</span><span class="o">(</span><span class="n">spot</span><span class="o">,</span> <span class="kc">null</span><span class="o">);</span></div><div class='line' id='LC71'>				<span class="o">}</span></div><div class='line' id='LC72'>				<span class="k">else</span> </div><div class='line' id='LC73'>				<span class="o">{</span></div><div class='line' id='LC74'>					<span class="n">java</span><span class="o">.</span><span class="na">util</span><span class="o">.</span><span class="na">Date</span> <span class="n">d</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC75'>					<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC76'>						<span class="n">d</span> <span class="o">=</span> <span class="n">format</span><span class="o">.</span><span class="na">parse</span><span class="o">(</span><span class="n">arg</span><span class="o">.</span><span class="na">getValue</span><span class="o">().</span><span class="na">toString</span><span class="o">());</span></div><div class='line' id='LC77'>					<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">ParseException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC78'>						<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC79'>					<span class="o">}</span></div><div class='line' id='LC80'>					<span class="n">java</span><span class="o">.</span><span class="na">sql</span><span class="o">.</span><span class="na">Date</span> <span class="n">d2</span> <span class="o">=</span> <span class="k">new</span> <span class="n">java</span><span class="o">.</span><span class="na">sql</span><span class="o">.</span><span class="na">Date</span><span class="o">(</span><span class="n">d</span><span class="o">.</span><span class="na">getTime</span><span class="o">());</span></div><div class='line' id='LC81'>					<span class="n">stat</span><span class="o">.</span><span class="na">setDate</span><span class="o">(</span><span class="n">spot</span><span class="o">,</span> <span class="n">d2</span><span class="o">);</span></div><div class='line' id='LC82'>					<span class="c1">///sql = sql.replaceFirst(Pattern.quote(&quot;?&quot;), &quot;&#39;&quot;+arg.getValue().toString()+&quot;&#39;&quot;);</span></div><div class='line' id='LC83'>				<span class="o">}</span></div><div class='line' id='LC84'>			<span class="o">}</span></div><div class='line' id='LC85'><br/></div><div class='line' id='LC86'>			<span class="k">else</span> <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;UNKNOWN TYPE&quot;</span><span class="o">);</span></div><div class='line' id='LC87'>		<span class="k">return</span> <span class="n">stat</span><span class="o">;</span></div><div class='line' id='LC88'>	<span class="o">}</span></div><div class='line' id='LC89'><br/></div><div class='line' id='LC90'><br/></div><div class='line' id='LC91'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">boolean</span> <span class="nf">checkUpdate</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">CommandArgument</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="n">CommandArgument</span><span class="o">[]</span> <span class="n">selectArgs</span><span class="o">)</span></div><div class='line' id='LC92'>	<span class="o">{</span></div><div class='line' id='LC93'>		<span class="n">PreparedStatement</span> <span class="n">stat</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC94'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC95'>			<span class="n">stat</span> <span class="o">=</span> <span class="n">connection</span><span class="o">.</span><span class="na">prepareStatement</span><span class="o">(</span><span class="n">sql</span><span class="o">);</span></div><div class='line' id='LC96'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC97'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC98'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC99'>		<span class="o">}</span></div><div class='line' id='LC100'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC101'><br/></div><div class='line' id='LC102'>			<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span><span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">args</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></div><div class='line' id='LC103'>				<span class="n">stat</span> <span class="o">=</span> <span class="n">setPreparedStatementArgument</span><span class="o">(</span><span class="n">stat</span><span class="o">,</span><span class="n">args</span><span class="o">[</span><span class="n">i</span><span class="o">],</span><span class="n">i</span><span class="o">+</span><span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC104'><br/></div><div class='line' id='LC105'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">NumberFormatException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC106'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC107'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC108'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC109'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC110'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC111'>		<span class="o">}</span>				</div><div class='line' id='LC112'><br/></div><div class='line' id='LC113'>		<span class="kt">int</span> <span class="n">count</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC114'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC115'>			<span class="n">ResultSet</span> <span class="n">re</span> <span class="o">=</span> <span class="n">stat</span><span class="o">.</span><span class="na">executeQuery</span><span class="o">();</span></div><div class='line' id='LC116'>			<span class="n">ResultSetMetaData</span> <span class="n">meta</span> <span class="o">=</span> <span class="n">re</span><span class="o">.</span><span class="na">getMetaData</span><span class="o">();</span></div><div class='line' id='LC117'>		    <span class="kt">int</span> <span class="n">cols</span> <span class="o">=</span> <span class="n">meta</span><span class="o">.</span><span class="na">getColumnCount</span><span class="o">();</span></div><div class='line' id='LC118'><br/></div><div class='line' id='LC119'>		    <span class="c1">// and finally, we dump the result set</span></div><div class='line' id='LC120'>		    <span class="k">while</span><span class="o">(</span><span class="n">re</span><span class="o">.</span><span class="na">next</span><span class="o">())</span></div><div class='line' id='LC121'>		    <span class="o">{</span></div><div class='line' id='LC122'>		        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span><span class="o">=</span><span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">cols</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></div><div class='line' id='LC123'>		        	<span class="k">if</span> <span class="o">(</span><span class="n">selectArgs</span><span class="o">[</span><span class="n">i</span><span class="o">].</span><span class="na">getType</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;Date&quot;</span><span class="o">))</span></div><div class='line' id='LC124'>		        	<span class="o">{</span></div><div class='line' id='LC125'>		        		<span class="k">if</span> <span class="o">(</span><span class="n">re</span><span class="o">.</span><span class="na">getDate</span><span class="o">(</span><span class="n">i</span><span class="o">+</span><span class="mi">1</span><span class="o">)</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span></div><div class='line' id='LC126'>		        		<span class="o">{</span></div><div class='line' id='LC127'>		        			<span class="c1">//Don&#39;t set a value</span></div><div class='line' id='LC128'>		        		<span class="o">}</span></div><div class='line' id='LC129'>		        		<span class="k">else</span></div><div class='line' id='LC130'>		        		<span class="o">{</span></div><div class='line' id='LC131'>		        			<span class="n">java</span><span class="o">.</span><span class="na">util</span><span class="o">.</span><span class="na">Date</span> <span class="n">newDate</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Date</span><span class="o">(</span><span class="n">re</span><span class="o">.</span><span class="na">getDate</span><span class="o">(</span><span class="n">i</span><span class="o">+</span><span class="mi">1</span><span class="o">).</span><span class="na">getTime</span><span class="o">());</span></div><div class='line' id='LC132'>		        			<span class="n">selectArgs</span><span class="o">[</span><span class="n">i</span><span class="o">].</span><span class="na">setValue</span><span class="o">(</span><span class="n">format</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="n">newDate</span><span class="o">));</span></div><div class='line' id='LC133'>		        		<span class="o">}</span></div><div class='line' id='LC134'>		        	<span class="o">}</span></div><div class='line' id='LC135'>		        	<span class="k">else</span></div><div class='line' id='LC136'>		        	<span class="o">{</span></div><div class='line' id='LC137'>		        		<span class="n">selectArgs</span><span class="o">[</span><span class="n">i</span><span class="o">].</span><span class="na">setValue</span><span class="o">(</span><span class="n">re</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="n">i</span><span class="o">+</span><span class="mi">1</span><span class="o">));</span></div><div class='line' id='LC138'>		        	<span class="o">}</span></div><div class='line' id='LC139'>		        <span class="o">}</span></div><div class='line' id='LC140'>		        <span class="n">count</span><span class="o">++;</span></div><div class='line' id='LC141'>		    <span class="o">}</span></div><div class='line' id='LC142'><br/></div><div class='line' id='LC143'><br/></div><div class='line' id='LC144'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC145'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC146'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC147'>		<span class="o">}</span>		</div><div class='line' id='LC148'>		<span class="k">if</span> <span class="o">(</span><span class="n">count</span> <span class="o">==</span> <span class="mi">1</span><span class="o">)</span></div><div class='line' id='LC149'>		<span class="o">{</span>	</div><div class='line' id='LC150'>			<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC151'><br/></div><div class='line' id='LC152'>		<span class="o">}</span></div><div class='line' id='LC153'>		<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC154'>	<span class="o">}</span></div><div class='line' id='LC155'><br/></div><div class='line' id='LC156'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">getSeqVal</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">)</span></div><div class='line' id='LC157'>	<span class="o">{</span></div><div class='line' id='LC158'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC159'>			<span class="n">PreparedStatement</span> <span class="n">stat</span> <span class="o">=</span> <span class="n">connection</span><span class="o">.</span><span class="na">prepareStatement</span><span class="o">(</span><span class="n">sql</span><span class="o">);</span></div><div class='line' id='LC160'>			<span class="n">ResultSet</span> <span class="n">re</span> <span class="o">=</span> <span class="n">stat</span><span class="o">.</span><span class="na">executeQuery</span><span class="o">();</span></div><div class='line' id='LC161'>			<span class="k">while</span> <span class="o">(</span><span class="n">re</span><span class="o">.</span><span class="na">next</span><span class="o">())</span></div><div class='line' id='LC162'>			<span class="o">{</span></div><div class='line' id='LC163'>				<span class="k">return</span> <span class="n">re</span><span class="o">.</span><span class="na">getInt</span><span class="o">(</span><span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC164'>			<span class="o">}</span></div><div class='line' id='LC165'><br/></div><div class='line' id='LC166'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC167'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC168'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC169'>		<span class="o">}</span></div><div class='line' id='LC170'><br/></div><div class='line' id='LC171'>		<span class="k">return</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC172'>	<span class="o">}</span></div><div class='line' id='LC173'><br/></div><div class='line' id='LC174'><br/></div><div class='line' id='LC175'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">boolean</span> <span class="nf">executeUpdate</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">CommandArgument</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="n">CommandArgument</span><span class="o">[]</span> <span class="n">selectArgs</span><span class="o">)</span></div><div class='line' id='LC176'>	<span class="o">{</span></div><div class='line' id='LC177'>		<span class="n">PreparedStatement</span> <span class="n">stat</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC178'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC179'>			<span class="n">stat</span> <span class="o">=</span> <span class="n">connection</span><span class="o">.</span><span class="na">prepareStatement</span><span class="o">(</span><span class="n">sql</span><span class="o">);</span></div><div class='line' id='LC180'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC181'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC182'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC183'>		<span class="o">}</span></div><div class='line' id='LC184'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC185'><br/></div><div class='line' id='LC186'><br/></div><div class='line' id='LC187'>		<span class="kt">int</span> <span class="n">i</span><span class="o">=</span><span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC188'>		<span class="k">for</span> <span class="o">(;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">selectArgs</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></div><div class='line' id='LC189'>		<span class="o">{</span></div><div class='line' id='LC190'>			<span class="n">stat</span> <span class="o">=</span> <span class="n">setPreparedStatementArgument</span><span class="o">(</span><span class="n">stat</span><span class="o">,</span><span class="n">selectArgs</span><span class="o">[</span><span class="n">i</span><span class="o">],</span><span class="n">i</span><span class="o">+</span><span class="mi">1</span><span class="o">);</span>			</div><div class='line' id='LC191'>		<span class="o">}</span></div><div class='line' id='LC192'>		<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i2</span> <span class="o">=</span><span class="mi">0</span><span class="o">;</span> <span class="n">i2</span> <span class="o">&lt;</span> <span class="n">args</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i2</span><span class="o">++)</span></div><div class='line' id='LC193'>		<span class="o">{</span></div><div class='line' id='LC194'>			<span class="n">stat</span> <span class="o">=</span> <span class="n">setPreparedStatementArgument</span><span class="o">(</span><span class="n">stat</span><span class="o">,</span><span class="n">args</span><span class="o">[</span><span class="n">i2</span><span class="o">],</span><span class="n">i</span><span class="o">+</span><span class="mi">1</span><span class="o">);</span>			</div><div class='line' id='LC195'>			<span class="n">i</span><span class="o">++;</span></div><div class='line' id='LC196'>		<span class="o">}</span></div><div class='line' id='LC197'><br/></div><div class='line' id='LC198'><br/></div><div class='line' id='LC199'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">NumberFormatException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC200'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC201'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC202'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC203'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC204'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC205'>		<span class="o">}</span>				</div><div class='line' id='LC206'><br/></div><div class='line' id='LC207'>		<span class="kt">int</span> <span class="n">count</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC208'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC209'>			<span class="n">count</span> <span class="o">=</span> <span class="n">stat</span><span class="o">.</span><span class="na">executeUpdate</span><span class="o">();</span>			</div><div class='line' id='LC210'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC211'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC212'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC213'>		<span class="o">}</span>	</div><div class='line' id='LC214'><br/></div><div class='line' id='LC215'>		<span class="k">if</span> <span class="o">(</span><span class="n">count</span> <span class="o">==</span> <span class="mi">1</span><span class="o">)</span></div><div class='line' id='LC216'>			<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC217'>		<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC218'>	<span class="o">}</span></div><div class='line' id='LC219'><br/></div><div class='line' id='LC220'><br/></div><div class='line' id='LC221'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">boolean</span> <span class="nf">runTransaction</span><span class="o">(</span><span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">PreparedStatement</span><span class="o">&gt;</span> <span class="n">preparedStatements</span><span class="o">)</span></div><div class='line' id='LC222'>	<span class="o">{</span></div><div class='line' id='LC223'>		<span class="c1">//turn autocommit off</span></div><div class='line' id='LC224'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC225'>			<span class="n">connection</span><span class="o">.</span><span class="na">setAutoCommit</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></div><div class='line' id='LC226'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC227'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC228'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC229'>			<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC230'>		<span class="o">}</span></div><div class='line' id='LC231'><br/></div><div class='line' id='LC232'>		<span class="c1">//run all queries</span></div><div class='line' id='LC233'>		<span class="k">for</span><span class="o">(</span><span class="n">PreparedStatement</span> <span class="n">preparedStatement</span> <span class="o">:</span> <span class="n">preparedStatements</span><span class="o">)</span></div><div class='line' id='LC234'>		<span class="o">{</span></div><div class='line' id='LC235'>			<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC236'>				<span class="n">preparedStatement</span><span class="o">.</span><span class="na">executeUpdate</span><span class="o">();</span></div><div class='line' id='LC237'>			<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC238'>				<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC239'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC240'>				<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC241'>			<span class="o">}</span></div><div class='line' id='LC242'>		<span class="o">}</span></div><div class='line' id='LC243'>		<span class="c1">//set back to true state</span></div><div class='line' id='LC244'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC245'>			<span class="n">connection</span><span class="o">.</span><span class="na">commit</span><span class="o">();</span></div><div class='line' id='LC246'>			<span class="n">connection</span><span class="o">.</span><span class="na">setAutoCommit</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></div><div class='line' id='LC247'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC248'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC249'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC250'>			<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC251'>		<span class="o">}</span></div><div class='line' id='LC252'>		<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC253'>	<span class="o">}</span></div><div class='line' id='LC254'><br/></div><div class='line' id='LC255'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">PreparedStatement</span> <span class="nf">makePreparedStatement</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">CommandArgument</span><span class="o">[]</span> <span class="n">args</span><span class="o">)</span></div><div class='line' id='LC256'>	<span class="o">{</span></div><div class='line' id='LC257'>		<span class="n">PreparedStatement</span> <span class="n">stat</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC258'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC259'>			<span class="n">stat</span> <span class="o">=</span> <span class="n">connection</span><span class="o">.</span><span class="na">prepareStatement</span><span class="o">(</span><span class="n">sql</span><span class="o">);</span></div><div class='line' id='LC260'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC261'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC262'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC263'>		<span class="o">}</span></div><div class='line' id='LC264'><br/></div><div class='line' id='LC265'>		<span class="kt">int</span> <span class="n">i</span><span class="o">=</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC266'>		<span class="k">for</span> <span class="o">(</span><span class="n">CommandArgument</span> <span class="n">arg</span> <span class="o">:</span> <span class="n">args</span><span class="o">)</span></div><div class='line' id='LC267'>		<span class="o">{</span></div><div class='line' id='LC268'>			<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC269'>				<span class="n">stat</span> <span class="o">=</span> <span class="n">setPreparedStatementArgument</span><span class="o">(</span><span class="n">stat</span><span class="o">,</span><span class="n">arg</span><span class="o">,</span><span class="n">i</span><span class="o">);</span></div><div class='line' id='LC270'>			<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">NumberFormatException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC271'>				<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC272'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC273'>			<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC274'>				<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC275'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC276'>			<span class="o">}</span></div><div class='line' id='LC277'>			<span class="n">i</span><span class="o">++;</span></div><div class='line' id='LC278'>		<span class="o">}</span></div><div class='line' id='LC279'>		<span class="k">return</span> <span class="n">stat</span><span class="o">;</span></div><div class='line' id='LC280'>	<span class="o">}</span></div><div class='line' id='LC281'><br/></div><div class='line' id='LC282'><br/></div><div class='line' id='LC283'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">String</span> <span class="nf">lookUpUser</span><span class="o">(</span><span class="n">String</span> <span class="n">id</span><span class="o">)</span></div><div class='line' id='LC284'>	<span class="o">{</span></div><div class='line' id='LC285'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC286'>			<span class="n">PreparedStatement</span> <span class="n">stat</span> <span class="o">=</span>  <span class="n">connection</span><span class="o">.</span><span class="na">prepareStatement</span><span class="o">(</span><span class="s">&quot;Select department,storeId from Staff where id = ?&quot;</span><span class="o">);</span></div><div class='line' id='LC287'>			<span class="kt">int</span> <span class="n">intid</span> <span class="o">=</span> <span class="n">Integer</span><span class="o">.</span><span class="na">parseInt</span><span class="o">(</span><span class="n">id</span><span class="o">);</span></div><div class='line' id='LC288'>			<span class="n">stat</span><span class="o">.</span><span class="na">setInt</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="n">intid</span><span class="o">);</span></div><div class='line' id='LC289'>			<span class="n">ResultSet</span> <span class="n">re</span> <span class="o">=</span> <span class="n">stat</span><span class="o">.</span><span class="na">executeQuery</span><span class="o">();</span></div><div class='line' id='LC290'>			<span class="n">Main</span><span class="o">.</span><span class="na">userId</span> <span class="o">=</span> <span class="n">intid</span><span class="o">;</span></div><div class='line' id='LC291'>			<span class="k">if</span> <span class="o">(</span><span class="n">re</span><span class="o">.</span><span class="na">next</span><span class="o">())</span></div><div class='line' id='LC292'>			<span class="o">{</span>				</div><div class='line' id='LC293'>				<span class="n">Main</span><span class="o">.</span><span class="na">userStoreId</span> <span class="o">=</span> <span class="n">re</span><span class="o">.</span><span class="na">getInt</span><span class="o">(</span><span class="s">&quot;storeId&quot;</span><span class="o">);</span></div><div class='line' id='LC294'>				<span class="k">return</span> <span class="n">re</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="s">&quot;department&quot;</span><span class="o">);</span></div><div class='line' id='LC295'>			<span class="o">}</span></div><div class='line' id='LC296'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC297'>			<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC298'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC299'>		<span class="o">}</span></div><div class='line' id='LC300'><br/></div><div class='line' id='LC301'>		<span class="k">return</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC302'>	<span class="o">}</span></div><div class='line' id='LC303'><br/></div><div class='line' id='LC304'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">boolean</span> <span class="nf">runPreparedStatement</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">CommandArgument</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">isSelect</span><span class="o">)</span></div><div class='line' id='LC305'>	<span class="o">{</span>		</div><div class='line' id='LC306'>		<span class="kt">boolean</span> <span class="n">result</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC307'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC308'><br/></div><div class='line' id='LC309'>			<span class="n">PreparedStatement</span> <span class="n">stat</span> <span class="o">=</span>  <span class="n">connection</span><span class="o">.</span><span class="na">prepareStatement</span><span class="o">(</span><span class="n">sql</span><span class="o">);</span></div><div class='line' id='LC310'><br/></div><div class='line' id='LC311'>			<span class="kt">int</span> <span class="n">i</span><span class="o">=</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC312'>			<span class="k">for</span> <span class="o">(</span><span class="n">CommandArgument</span> <span class="n">arg</span> <span class="o">:</span> <span class="n">args</span><span class="o">)</span></div><div class='line' id='LC313'>			<span class="o">{</span></div><div class='line' id='LC314'>				<span class="n">stat</span> <span class="o">=</span> <span class="n">setPreparedStatementArgument</span><span class="o">(</span><span class="n">stat</span><span class="o">,</span><span class="n">arg</span><span class="o">,</span><span class="n">i</span><span class="o">);</span></div><div class='line' id='LC315'>				<span class="n">i</span><span class="o">++;</span></div><div class='line' id='LC316'>			<span class="o">}</span></div><div class='line' id='LC317'><br/></div><div class='line' id='LC318'>			<span class="k">if</span> <span class="o">(!</span><span class="n">isSelect</span><span class="o">)</span></div><div class='line' id='LC319'>			<span class="o">{</span></div><div class='line' id='LC320'>				<span class="n">stat</span><span class="o">.</span><span class="na">executeUpdate</span><span class="o">();</span></div><div class='line' id='LC321'>				<span class="n">result</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC322'>			<span class="o">}</span></div><div class='line' id='LC323'>			<span class="k">else</span></div><div class='line' id='LC324'>			<span class="o">{</span></div><div class='line' id='LC325'>				<span class="n">ResultSet</span> <span class="n">re</span> <span class="o">=</span> <span class="n">stat</span><span class="o">.</span><span class="na">executeQuery</span><span class="o">();</span></div><div class='line' id='LC326'>				<span class="n">ResultSetMetaData</span> <span class="n">meta</span> <span class="o">=</span> <span class="n">re</span><span class="o">.</span><span class="na">getMetaData</span><span class="o">();</span></div><div class='line' id='LC327'>			    <span class="kt">int</span> <span class="n">cols</span> <span class="o">=</span> <span class="n">meta</span><span class="o">.</span><span class="na">getColumnCount</span><span class="o">();</span></div><div class='line' id='LC328'><br/></div><div class='line' id='LC329'>			    <span class="c1">// we dump the column information about the result set</span></div><div class='line' id='LC330'>		        <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">print</span><span class="o">(</span><span class="s">&quot;Row Number\t&quot;</span><span class="o">);</span></div><div class='line' id='LC331'>			    <span class="k">for</span> <span class="o">(</span><span class="n">i</span><span class="o">=</span><span class="mi">1</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;=</span> <span class="n">cols</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span></div><div class='line' id='LC332'>			    <span class="o">{</span></div><div class='line' id='LC333'>			        <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">print</span><span class="o">(</span><span class="n">meta</span><span class="o">.</span><span class="na">getColumnName</span><span class="o">(</span><span class="n">i</span><span class="o">)+</span> <span class="s">&quot;\t&quot;</span><span class="o">);</span></div><div class='line' id='LC334'>			    <span class="o">}</span></div><div class='line' id='LC335'><br/></div><div class='line' id='LC336'>			    <span class="c1">// and finally, we dump the result set</span></div><div class='line' id='LC337'>			    <span class="kt">int</span> <span class="n">cnt</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span>			   </div><div class='line' id='LC338'>			    <span class="k">while</span><span class="o">(</span><span class="n">re</span><span class="o">.</span><span class="na">next</span><span class="o">())</span></div><div class='line' id='LC339'>			    <span class="o">{</span></div><div class='line' id='LC340'>			        <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">print</span><span class="o">(</span><span class="s">&quot;\n&quot;</span><span class="o">+</span><span class="n">cnt</span><span class="o">+</span><span class="s">&quot;\t\t&quot;</span><span class="o">);</span></div><div class='line' id='LC341'>			        <span class="k">for</span> <span class="o">(</span><span class="n">i</span><span class="o">=</span><span class="mi">1</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;=</span> <span class="n">cols</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></div><div class='line' id='LC342'>			            <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">print</span><span class="o">(</span><span class="n">re</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="n">i</span><span class="o">)+</span><span class="s">&quot;\t&quot;</span><span class="o">);</span></div><div class='line' id='LC343'>			        <span class="o">}</span></div><div class='line' id='LC344'>			        <span class="n">cnt</span><span class="o">++;</span></div><div class='line' id='LC345'>			    <span class="o">}</span></div><div class='line' id='LC346'>			    <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">();</span></div><div class='line' id='LC347'>			    <span class="n">result</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC348'><br/></div><div class='line' id='LC349'>			<span class="o">}</span></div><div class='line' id='LC350'>			<span class="n">stat</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC351'>			<span class="k">return</span> <span class="n">result</span><span class="o">;</span></div><div class='line' id='LC352'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC353'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC354'>			<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC355'>		<span class="o">}</span></div><div class='line' id='LC356'>	<span class="o">}</span></div><div class='line' id='LC357'><br/></div><div class='line' id='LC358'><br/></div><div class='line' id='LC359'><br/></div><div class='line' id='LC360'><br/></div><div class='line' id='LC361'><br/></div><div class='line' id='LC362'><br/></div><div class='line' id='LC363'>	<span class="kd">private</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">initialize</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC364'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC365'>			<span class="n">Class</span><span class="o">.</span><span class="na">forName</span><span class="o">(</span><span class="s">&quot;oracle.jdbc.driver.OracleDriver&quot;</span><span class="o">);</span></div><div class='line' id='LC366'>			<span class="n">connection</span> <span class="o">=</span> <span class="n">DriverManager</span><span class="o">.</span><span class="na">getConnection</span><span class="o">(</span><span class="n">jdbcURL</span><span class="o">,</span> <span class="n">user</span><span class="o">,</span> <span class="n">password</span><span class="o">);</span></div><div class='line' id='LC367'>	<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC368'>		<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC369'>	<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">ClassNotFoundException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC370'>		<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC371'>		<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC372'>	<span class="o">}</span></div><div class='line' id='LC373'>	<span class="o">}</span></div><div class='line' id='LC374'><br/></div><div class='line' id='LC375'><br/></div><div class='line' id='LC376'><br/></div><div class='line' id='LC377'>	<span class="kd">private</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">close</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC378'>		<span class="k">if</span> <span class="o">(</span><span class="n">connection</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC379'>			<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC380'>				<span class="n">connection</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC381'>			<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC382'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC383'>			<span class="o">}</span></div><div class='line' id='LC384'>		<span class="o">}</span></div><div class='line' id='LC385'>		<span class="k">if</span> <span class="o">(</span><span class="n">statement</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC386'>			<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC387'>				<span class="n">statement</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC388'>			<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC389'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC390'>			<span class="o">}</span></div><div class='line' id='LC391'>		<span class="o">}</span></div><div class='line' id='LC392'>		<span class="k">if</span> <span class="o">(</span><span class="n">result</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC393'>			<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC394'>				<span class="n">result</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC395'>			<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">SQLException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC396'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC397'>			<span class="o">}</span></div><div class='line' id='LC398'>		<span class="o">}</span></div><div class='line' id='LC399'>	<span class="o">}</span></div><div class='line' id='LC400'><br/></div><div class='line' id='LC401'><span class="o">}</span></div></pre></div>
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


    <p class="right">&copy; 2012 <span title="0.06471s from fe2.rs.github.com">GitHub</span> Inc. All rights reserved.</p>
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

    
    
    <span id='server_response_time' data-time='0.06596' data-host='fe2'></span>
    
  </body>
</html>

