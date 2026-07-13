# com.yourname.Portfolio

A single-file, self-contained portfolio site styled as an annotated Java class — IDE-inspired dark theme, line numbers, syntax-highlighted keywords, and a `public static void main` hero. Built to be dropped straight onto GitHub Pages as `index.html`.

## Preview

- **Hero** — an editor window titled `Portfolio.java` showing a mini Java class (name, role, one-line mission), next to a "Profile.jpg" card with the headshot.
- **`/** About */`** — a Javadoc-style comment block (`@author`, `@since`) wrapping a short bio paragraph.
- **`implements Skills`** — four skill cards (Core Java, Frameworks, Data & Infra, Tooling) with progress bars per skill.
- **`public Project[] projects`** — collapsible project cards styled as method signatures (`projectOne()`, `projectTwo()`, `projectThree()`), each with a description, tech chips, and links.
- **`public Contact()`** — a constructor-style block with email, GitHub, and LinkedIn links (icon + label).

## Design

| Token | Value | Used for |
|---|---|---|
| `--bg` | `#14161a` | page background |
| `--panel` / `--panel-2` | `#1b1e24` / `#20242c` | cards, editor windows |
| `--keyword` | `#c586c0` | magenta — keywords (`public`, `private`, `class`) |
| `--type` | `#4ec9b0` | teal — types (`String`, `Project`) |
| `--string` | `#e2b872` | amber — string literals, accents |
| `--func` | `#dcdcaa` | function/method names |
| `--text-dim` | `#6d7480` | comments, line numbers |

Fonts: **JetBrains Mono** (code) + **Inter** (prose), loaded from Google Fonts. Fully responsive with a collapsing mobile nav and a hamburger toggle; no build step, no dependencies — just one HTML file with inline CSS/JS.

## Structure

```
index.html      # everything: markup, styles, script, base64 profile photo
```

Sections are anchored (`#about`, `#skills`, `#projects`, `#contact`) and wired to the nav; a small inline script handles the mobile menu toggle and the project fold/unfold interaction.

## Customizing

Swap out the placeholder content before publishing:

- `com.yourname.Portfolio` in the nav → your actual name/handle
- `name` / `role` fields in the hero code block
- The `/** About */` bio paragraph and `@since` year
- Skill cards and bar widths (`style="width:XX%"`) under **Skills**
- `projectOne()` / `projectTwo()` / `projectThree()` bodies, tech chips, and GitHub/demo links
- `you@example.com`, `github.com/yourhandle`, `linkedin.com/in/yourhandle` in **Contact**
- The base64 `profile-photo` image (re-export and re-embed, or point `src` to an external image URL)

## Deployment (GitHub Pages)

1. Push `index.html` to the root of a repo (or `/docs`).
2. In the repo, go to **Settings → Pages**, set the source branch/folder.
3. The site publishes at `https://<username>.github.io/<repo>/`.

## License

Free to use and adapt for your own portfolio.
